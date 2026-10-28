package com.office.arrayex;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		/*
		 * 배열 선언
		 * 1. 데이터타입[] 배열변수명 = {...};
		 */
		// int[] numbers;  // 이렇게 배열 선언( 생성 )
		int[] numbers1 = {1, 2, 3, 4, 5};  // 배열 초기화
		/*
		 * 2. 데이터타입[] 배열변수명 = new 데이터타입[배열의길이];
		 * ( 장 안쓰인다 
		 */
		int[] numbers2 = new int[5];
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		numbers2[4] = 5;
		/*
		 * 3. 데이터타입[] 배열변수명 = new 데이터타입[] {...};
		 * ( 잘 안쓰인다 )
		 */
		int[] numbers3 = new int[] {1, 2, 3, 4, 5};
		
		/*
		 * 배열 데이터 조회 : 인덱스를 이용한 데이터 조회
		 */
		int[] scores = {80, 90, 100, 75, 60};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]: %d", i, scores[i]);
		}
		
		/*
		 * 배열 데이터 수정 : 인덱스를 이용
		 */
        int[] points = {80, 70, 100, 60, 90};
        points[2] = 3000;
        
        // 배열 모두 보기 => for문
        for(int i = 0; i < points.length; i++) {
        	System.out.printf("points[%d]: %d\n", i, points[i]);
        }
        // 배열 모두 보기 => foreach
        for (int point : points) {
        	System.out.println("point: " + point);
        }     
        // 배열 데이터 수정
        points[0] = 800;
        System.out.println("points[0]: " + points[0]);   // 800
        
        
        
        
        
        /*
         * java의 배열 특징
         * 1. 배열은 단일 데이터타입만 저장 가능하다.
         * js 에선 -> let nums = [10, 20, 30, 'Hello']; 이런게 가능했었지만 java에선 안된다
         * 2. 최초 선언된 배열의 길이는 변경 불가하다.
         * 3. 존재하지 않는 인덱스를 이용하게 되면 에러 발생한다
         */
//        int[] ns = {1, 2, 3};  // length: 3
//        
//        ns = new int[5]; 
        // 이건 배열의 길이가 변경된게 아니라 새로운 배열이 생긴거고
        // 이전에 있던 배열은 갈뷔지 컬렉터가 메모리를 지켜보다가 임자없는 배열은 삭제 된다
        
        
//        int[] ns = {1, 2, 3};   // length: 3      
//        System.out.println(ns[3]);   // error    
//        System.out.println("+++++");  // 앞에 에러났으니 이건 작동 안된다
        
		
        
		
        /*
         * 배열을 이용해서 학급 학생의 시험 성적, 총점, 평균을 출력하자
         */
        int[] studentScore = {80, 95, 100, 70, 68, 74, 88, 98, 100, 76};
        int total = 0;         // 총합
        float average = 0.0f;  // 평균
        
        for (int i = 0; i < studentScore.length; i++) {
        	// 학생 개인 점수 출력
        	System.out.printf("studentScore[%d] score: %d \n", i, studentScore[i]);
        	
        	// 총합
        	total += studentScore[i];
        }
		
        // 총합 출력
        System.out.println("Total score: " + total);
        
        // 평균 출력
        average = total / studentScore.length;
        System.out.println("Average: " + average);
		
		
		
        
        // 값이 없는 배열의 초기값은?
        // 방만 만들어놨을 때 c 언어는 메모리 방을 비워놓지만
        // java 는 int 방을 만들었으니까 모두 0으로 초기화 해 놓는다
        
        int[] classes = new int[5];
        for (int i = 0; i < classes.length; i++) {
        	System.out.println(classes[i]);
        }
        
        float[] averages = new float[5];
        for (int i = 0; i < averages.length; i++) {
            System.out.println(averages[i]);
        }
                
		
		
		
		/*
		 * 배열 복사
		 */
        int number1 = 10;
        int number2 = 20;
        
        System.out.println("number1: " + number1);  // 10
        System.out.println("number2: " + number2);  // 20
		
        number2 = number1;
		
        System.out.println("number1: " + number1);  // 10
        System.out.println("number2: " + number2);  // 10
		
		number1 = 100;
		
        System.out.println("number1: " + number1);  // 100
        System.out.println("number2: " + number2);  // 10
        // 기초데이터 타입 특징이다
        
        
        
        // 하지만 배열 복사는 메모리 주솟값을 복사한다
        int[] numbers = {1, 2, 3};
        int[] numbersCopy = numbers;
        
        System.out.println("numbers: " + numbers);          // 메모리 주소
        System.out.println("numbersCopy: " + numbersCopy);  // 메모리 주소
		
        for(int i = 0; i < numbers.length; i++) {
        	System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }
        
        for(int i = 0; i < numbersCopy.length; i++) {
        	System.out.printf("numbersCopy[%d]: %d\n", i, numbers[i]);
        }
		// 래퍼런스 타입의 특징이다
        
        numbers[0] = 100;      // 한 쪽에서 수정하면 다른 쪽에도 영향이 미쳐
        System.out.println(numbersCopy[0]);  // 100 이 나온다
        
        
        
        
        // 배열 깊은 복사 하는 법
        // int[] numbers = {1, 2, 3 };   ---> int[] numbersDeepCopy
        int[] numbersDeepCopy = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
        	numbersDeepCopy[i] = numbers[i];
        }
        
        for(int i = 0; i < numbersDeepCopy.length; i++) {
        	System.out.printf("numbersDeepCopy[%d]: %d\n", i, numbersDeepCopy[i]);
        }
		
        for(int i = 0; i < numbers.length; i++) {
        	System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }
		
        numbersDeepCopy[2] = 3000;
        System.out.println("numbersDeepCopy[2]: " + numbersDeepCopy[2]);
        
        // 자바에서 깊은 복사를 빨리 할 수 있도록 만들어놓은게 있다
        // 인터넷에 찾아보면 있다
        
		
		
		
        
        
        // 배열 삭제
        int[] myScores = {80, 90, 100};
        System.out.println("myScores: " + myScores);  // 메모리 주소가 나온다
        
        myScores = null;
        System.out.println("myScores: " + myScores);  // null
        // 메모리 주소 카피한 다른 연결이 하나라도 있다면 배열은 사라지지 않는다
        
        
        
        
        // 다차원 배열
        // 2차원 배열까지는 쓸만하지만 3차원 이상 쓰려고 하지말자( 너무 복잡해진다 )
//        int[][]mns = new int[3][2];
//        System.out.println("mns: " + mns); // [[메모리주소
        // [메모리주소 --> 여기서 대괄호가 차원의 차수
        /*
         * int[] myScore == int myScores[] / 이런 방법도 있지만 잘 안쓰인다
         * int[][] mns == int mns[][] / 다차원 방법도 이렇게 쓸 수 있지만 비추
         */
        
        // 1.
//        int[][] mns = {{1,2}, {10, 20}, {100, 200}};  // 3x2 
        
        // 2. 
//        int[][] mns = new int[3][2];
//        mns[0][0] = 1;
//        mns[0][1] = 2;
//        mns[1][0] = 10;
//        mns[1][1] = 20;
//        mns[2][0] = 100;
//        mns[2][1] = 200;

        // 3.
        int[][] mns = new int[][] {{1, 2}, {10, 20}, {100, 200}};
        
        
        // 데이터 조회
        System.out.println(mns[0]);   // 2차원 배열의 주소
        System.out.println(mns[0][0]);   // 2차원 배열의 값
//        System.out.println(mns[0][2]);   // 에러발생
        
        // 데이터 수정
        mns[0][0] = 1000;
        System.out.println(mns[0][0]);   // 1000
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
	}

}
