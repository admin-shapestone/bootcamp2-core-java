package com.shapestone.exception_handling;

public class Try_CatchBlocks {

	public static void main(String[] args) {
		try {
			System.out.println("trt block ");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(e);// java.lang.ArithmeticException: / by zero

		}
		/*
		 * If any exception raised in try block.the program executes upto exception.if
		 * exception raised the codes turn in abnormal termination.and it executes catch
		 * block
		 */
		try {
			System.out.println("statement one");
			System.out.println(10 / 0);
			System.out.println("statement two");
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * //the order of catch block should be child to parent but not parent to child
		 */ try {
			System.out.println(10 / 0);
		}

		catch (ArithmeticException e) {
			System.out.println(e);
		} catch (RuntimeException re) {
			System.out.println(re);
		} catch (Exception re) {
			System.out.println(re);
		}

		/*
		 * try { System.out.println(10/0); } catch(Exception e) { System.out.println(e);
		 * } catch(ArithmeticExceptiont e) { System.out.println(e); }
		 */
	}

}
