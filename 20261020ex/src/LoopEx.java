// import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
	
		// 반복문
		// for문:  횟수가 정해졌을 때
		// while문: 조건에 의한 반복 실행해야 될 때
		
		// 안녕하세요를 5회 출력하자
//		for(초기화; 조건식; 단계)
//	    for(시작; 끝; 단계)
	    
		/*
	    for (int i = 1; i < 6; i++) {
	    	System.out.println("안녕하세요.");
	    }
	    
	    int i = 1;
	    for (; i < 6; i++) {
	    	System.out.println("Hello");
	    }
	    
	    int j = 0;
	    for (j = 5; j < 10; j++) {
	    	System.out.println("H");
	    }
	    
	    for(int k = 0; k < 10; ++k) {  // 여기선 전위연산자, 후위연산자 상관 없다
	    	System.out.println("O");
	    }
	    */
	    
	    // 1부터 사용자가 입력한 정수까지의 합을 구하는 프로그램을 만들어 보자
//	    Scanner scanner = new Scanner(System.in);
//	    
//	    System.out.println("정수 입력하셍");
//	    int inputData = scanner.nextInt();
//	    
//	    int sum = 0;
//	    for(int i = 1; i <= inputData; i++) {
//	    	sum += 1;
//	    }
//		
//	    System.out.println("sum: " + sum);
//	    
//	    scanner.close();
		
		
		/*
		// 3단 구구단 출력
		for (int i = 1; i < 10; i++) {
//			System.out.println("3 * " + i + "=" + (3*i));
//			System.out.printf("3 * %d = %d%n", i, (3 * i));
			System.out.println(String.format("3 * %d = %d", i, (3 * i)));
			
		}
		*/
		
		
		//                     20261021
		
		// 전체 구구단 (가로모드, 세로모드) 출력하자
		
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//			System.out.println(String.format("%d * %d = %d",i , j, (j * i)));
//			}
//		}
		
		
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				if (j == 9) {
//				System.out.printf("%d X %d = %d%n", j, i, (j*i));
//			} else {
//				System.out.printf("%d X %d = %d\t", j, i, (j*i));
//			}
//		}
//		}
		
		/*
		boolean flag = true;
		for(int i = 1; flag; i++) {
			System.out.println("i: " + i);
			if (i > 10)
				flag = false;
//				break;
			
		}
		*/
		/*
		for(double d = 0.0; d < 1; d += 0.1) {
			System.out.printf("d: %f \n", d);
		}  // 이런 double 쓰지말고 int 쓰자 그냥
		*/
		
		//******************************
		// 절대 중첩 for문을 이용할 때 절대 3단계 이상을 사용하지 말자!
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				for (int k = 0; k < 10; k++) {
//					
//				}
//			}
//		}
		// CPU 연산 속도가 확 낮아진다, 절대 쓰지 말자
		// if문 이것도 중첩 3단계 이상 하지 말자
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		// 별표가 아니라 공백을 찍는다는 마인드로 접근하면 된다
		/*
		for (int i = 0; i < 6; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < 5 - i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		*/
		
//		for (int i = 1; i < 6; i++) {
//			
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			
//			for (int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		// 별표 모양 트리 만들기
		// 맨 위부터 1, 3, 5, 7, 9...
		
		
		
		
		System.out.println("MON\tTUE\tWED\tTHU\tFRI\tSAT\tSUN");
		int offset = 3;
		int day = 1;
		
		for (int i = 0; i < 5; i++) {
			
			// '-'
			for (int j = 0; j < offset; j++) {
				System.out.print(String.format("%3c\t", '-'));
			}
			
			// '날짜'
			for (int j = 0; j < 7 - offset; j++) {  
				
				if (day <= 30) {
				System.out.printf(String.format("%3d\t", day));
				day++;
			} else {
				System.out.print(String.format("%3c\t", '-'));
			    }
			
			}
			offset = 0;
			System.out.println();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * while문
		 * 조건에 의한 반복
		 * 
		 * while(조건식) {
		 *     실행문
		 * }
		 * 
		 */
		
		
		
		
		
		
		
		
		
			
		

	}

}
