package triangle;

import java.util.*;

/*
 * Write a program to find whether a point lies inside a triangle or not
 */
public class TrianglePointFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Left side base co-ordinates :");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.println("Enter Right side base co-ordinates :");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		System.out.println("Enter Top side co-ordinates :");
		int x3 = scanner.nextInt();
		int y3 = scanner.nextInt();
		System.out.println("Enter co-ordinates that needs to be checked :");
		int p1 = scanner.nextInt();
		int p2 = scanner.nextInt();
		System.out.println(isPresentInsideTriangle(x1, y1, x2, y2, x3, y3, p1,
				p2));
		scanner.close();
	}

	public static boolean isPresentInsideTriangle(int x1, int y1, int x2,
			int y2, int x3, int y3, int p1, int p2) {
		int largest_x_coordinate = 0;
		int largest_y_coordinate = 0;

		/*
		 * Find largest x-axis co-ordinate
		 */
		if (x1 <= x2) {
			largest_x_coordinate = x2;
			if (largest_x_coordinate <= x3) {
				largest_x_coordinate = x3;
			}
		}
		/*
		 * Find largest y-axis co-ordinate
		 */
		if (y1 <= y2) {
			largest_y_coordinate = y2;
			if (largest_y_coordinate <= y3) {
				largest_y_coordinate = y3;
			}
		}

		if (p1 <= largest_x_coordinate && p2 <= largest_y_coordinate)
			return true;
		else
			return false;
	}
}
