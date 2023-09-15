package calctime;

public class SystemTime {

	public static void main(String[] args) {
		// 성능 테스트 소요 시간 측정 - ms, ns

		//long start = System.currentTimeMillis(); //현재까지의 시간(밀리초)
		long start = System.nanoTime();  //현재까지의 시간(나노초)
		
		long sum = 0;
		for(int i=0; i<10000000; i++) {
			sum += i;
		}
		
		//long end = System.currentTimeMillis(); //계산이 끝난 시간
		long end = System.nanoTime();
		
		System.out.println(sum);
		//System.out.println((end - start) + "ms"); //계산 소요 시간(밀리초)
		System.out.println((end - start)/1000000 + "ns"); //계산 소요 시간(나노초)
		
	}

}
