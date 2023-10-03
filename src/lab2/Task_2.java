package lab2;

public class Task_2 {

		public static void printPyramid(int n) {
		    for (int i = 1; i <= n; i++) {
		    	
		        for (int j = 1; j <= n - i; j++) {
		            System.out.print(" ");
		        }
		        for (int k = 1; k <= 2 * i - 1; k++) {
		            System.out.print("X");
		        }
		        System.out.println();
		    }
		}
		//Task_2.2
		public static void printPyramid1(int n) {
		    for (int i=1; i<=n; i++) {
		    	
		        for (int j = 1; j <= n - i; j++) {
		            System.out.print(" ");
		        }
		        for (int k = 1; k <= i; k++) {
		            System.out.print(i);
		        }
		        System.out.println();
		    }
		    }
		public static void printPyramid2(int n) {
		    for (int i=1; i<=n; i++ ) {
		    	
		        for (int j = 1; j <= n - i; j++) {
		            System.out.print(" ");
		        }
		        for (int k = 1; k <= i ; k++) {
		            System.out.print(k);
		        }
		        System.out.println();
		    }
		}
		//Task_2.3
		public static void drawXmasTree(int n) {
		   // số lượng cây thông Noel
		    int maxStars = 2 * n - 1; // số lượng sao tối đa của cây thông Noel cuối cùng
		    int maxSpaces = maxStars / 2; // số lượng khoảng trắng tối đa ở đầu mỗi dòng

		    for (int i = 1; i <= n; i++) {
		        // In ra các cây thông Noel
		        for (int j = 1; j <= i; j++) {
		            // In ra khoảng trắng trước khi in cây thông Noel
		            for (int k = 1; k <= maxSpaces; k++) {
		                System.out.print(" ");
		            }
		            // In ra sao của cây thông Noel
		            for (int k = 1; k <= 2 * j - 1; k++) {
		                System.out.print("X");
		            }
		            System.out.println();
		            maxSpaces--;
		        }
		        maxSpaces += 2;
		    }

		    // In ra thân cây thông Noel
		    for (int i = 1; i <= 3; i++) {
		        for (int j = 1; j <= maxSpaces; j++) {
		            System.out.print(" ");
		        }
		        System.out.println("X");
		    }

		    // In ra các cây thông Noel lần thứ 2
		    maxSpaces--;
		    for (int i = 1; i <= n; i++) {
		        // In ra khoảng trắng trước khi in cây thông Noel
		        for (int j = 1; j <= maxSpaces; j++) {
		            System.out.print(" ");
		        }
		        // In ra sao của cây thông Noel
		        for (int j = 1; j <= 2 * i - 1; j++) {
		            System.out.print("X");
		        }
		        System.out.println();
		        maxSpaces--;
		    }
		}
	public static void main(String[] args) {
		printPyramid(4);
		System.out.println("---");
		printPyramid1(4);
		System.out.println("---");
		printPyramid2(10);
		
		System.out.println();
		drawXmasTree(4);
	}

}
