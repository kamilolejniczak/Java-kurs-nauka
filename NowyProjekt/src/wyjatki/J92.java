package wyjatki;

public class J92 {

		void canThrowExc() throws Exception {
		if (new java.util.Random().nextInt(5) == 0)
		throw new Exception();
		}
	
		public static void main(String[] args) {
			J92 z = new J92();
			int i = 1;
			try {
			z.canThrowExc();
			i++;
			z.canThrowExc();
			i++;
			z.canThrowExc();
			i++;
			z.canThrowExc();
			i++;
			z.canThrowExc();
			i++;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getCause());
				System.out.println("Wyj�tek wywo�any zosta� po "+i+" losowaniu");
			//jaki� kod obs�ugi
			}
			if(i==6){
				System.out.println("Wyj�tek nie wyst�pi�");
			}
		}
}
	


