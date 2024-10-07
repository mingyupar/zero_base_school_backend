public static void main(String[] args) {
	System.out.println("1-1.구구단 출력 : 단 사이에 빈 줄 넣기");//구구단 출력
		
	int i,j; // i=단
	for(i=2;i<=9;i++) {
			
		for(j=1;j<=9;j++) {
			System.out.println(i+"X"+j+"="+(i*j));
		}//안쪽 for끝
		System.out.println("");//구분용 빈줄
	}//바깥 for끝