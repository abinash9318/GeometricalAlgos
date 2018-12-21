package triangle;

import java.util.*;

/*
 * Write a program to find area of an triangle
 */
public class TriangleAreaFinder {
	enum type {
		EQUILATERAL, ISOSCELES, SCALANE, RIGHT_HAND
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side1 : ");
		int side1 = scanner.nextInt();
		System.out.println("Enter side2 : ");
		int side2 = scanner.nextInt();
		System.out.println("Enter side3 : ");
		int side3 = scanner.nextInt();
		System.out.println(areaOfTriangle(side1, side2, side3));
		scanner.close();
	}

	/*
	 * Find what type of triangle it is
	 */
	public static type triangleFinder(int side1, int side2, int side3) {

		if (side1 == side2 && side1 == side3)
			return type.EQUILATERAL;
		else if (side1 == side2 || side1 == side3)
			return type.ISOSCELES;
		else if (side1 != side2 && side1 != side3)
			return type.SCALANE;
		else if ((Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2))
				|| (Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2,
						2))
				|| (Math.pow(side3, 2) + Math.pow(side2, 2) == Math.pow(side1,
						2)))
			return type.RIGHT_HAND;
		else
			return null;
	}

	/*
	 * Find area of triangle based on triangle type
	 */
	public static float areaOfTriangle(int side1, int side2, int side3) {
		float area = 0.0f;

		if (triangleFinder(side1, side2, side3).equals("EQUILATERAL")
				|| triangleFinder(side1, side2, side3).equals("ISOSCELES")
				|| triangleFinder(side1, side2, side3).equals("SCALANE")) {
			float s = (side1 + side2 + side3) / 2;
			area = (float) Math.sqrt(s * (s - side1) * (s - side2)
					* (s - side3));
		} else {
			area = 0.5f * side1 * side2;
		}
		return area;
	}
}

/*
 * To do : How to find what is the base and height for right hand triangle ?
 */
