/*
 * package com.shapestone.files;
 * 
 * import java.io.File; import java.io.IOException;
 * 
 * import com.fasterxml.jackson.core.exc.StreamReadException; import
 * com.fasterxml.jackson.databind.DatabindException; import
 * com.fasterxml.jackson.databind.ObjectMapper;
 * 
 * public class StudentM {
 * 
 * public static void main(String[] args) throws StreamReadException,
 * DatabindException, IOException {
 * 
 * 
 * 
 * int sum=0; ObjectMapper object = new ObjectMapper(); Student[] readvalue =
 * object.readValue(new File("student.json"), Student[].class);
 * System.out.printf(
 * "------------------------------------------------------------STUDENT DETAILS--------------------------------------------------------%n"
 * ); System.out.printf(
 * "-----------------------------------------------------------------------------------------------------------------------------------%n"
 * ); System.out.printf("| %15s | %15s | %15s | %50s| %20s| %n", "Name",
 * "fathername", "mothername", "marks","totalMarks"); System.out.printf(
 * "------------------------------------------------------------------------------------------------------------------------------------%n"
 * ); for (int i = 0; i < readvalue.length; i++) {
 * System.out.printf("| %15s | %15s | %15s |%50s| %n", readvalue[i].getName(),
 * readvalue[i].getFathername(), readvalue[i].getMothername(),
 * readvalue[i].getMarks(),readvalue); } System.out.printf(
 * "------------------------------------------------------------------------------------------------------------------------------------%n"
 * );
 * 
 * 
 * } static int getTotalMarks(Result marks) { int totalMarks = 0; totalMarks +=
 * Integer.parseInt(marks.getTelugu()); totalMarks +=
 * Integer.parseInt(marks.getHindi()); totalMarks +=
 * Integer.parseInt(marks.getEnglish()); totalMarks +=
 * Integer.parseInt(marks.getMaths()); totalMarks +=
 * Integer.parseInt(marks.getPhysics()); totalMarks +=
 * Integer.parseInt(marks.getChemistry()); return totalMarks;
 * 
 * }}
 * 
 */




package com.shapestone.files;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentM {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode jsonNode = objectMapper.readTree(new File("student.json"));

            System.out.println("---------------------------------------------------------------------------------------------------------------------------");
            System.out.println("|    Name    |  Father Name  |  Mother Name  |  Telugu  |  Hindi  |  English  |  Maths  |  Physics  |  Chemistry  |   Total   |");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------");

            for (JsonNode studentNode : jsonNode) {//for each to print json details
                String name = studentNode.get("name").asText();
                String fatherName = studentNode.get("fathername").asText();
                String motherName = studentNode.get("mothername").asText();
                
                JsonNode marks = studentNode.get("marks");

                int totalMarks = 0;
                int[] subjectMarks = new int[6];//int of array
                String[] subjects = {"telugu", "hindi", "english", "maths", "physics", "chemistry"};

                for (int i = 0; i < subjects.length; i++) { //for to print total marks by after iterating
                    String subject = subjects[i];
                    int mark = marks.get(subject).asInt();
                    subjectMarks[i] = mark;
                    totalMarks += mark;
                }

                System.out.printf("| %10s | %13s | %13s | %8d | %7d | %9d | %7d | %9d | %11d | %9d |%n",
                        name, fatherName, motherName, subjectMarks[0], subjectMarks[1], subjectMarks[2], subjectMarks[3],
                        subjectMarks[4], subjectMarks[5], totalMarks);
            }

            System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
