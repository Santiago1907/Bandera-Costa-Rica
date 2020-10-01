public class CostaRica{
	public static void main(String[] args) {
		
		char matriz[][];
		matriz = new char[6][9];

		for (int i=0;i<1 ;i++ ){
		 for (int j=0;j<matriz[0].length;j++ ){
		 		matriz[i][j] = 'A';
		 }
		 	
		}
		 
		for(int i=1; i<2; i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]='B';
            }
        }
        
        for(int i=2; i<4; i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]='R';
            }
        }
		 
		for(int i=4; i<5; i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]='a';
            }
        }

        for(int i=5; i<6; i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]='b';
            }
        }

		 for (int i=0;i<matriz.length ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		
		 		if(matriz[i][j]=='A')
		 		{
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"*");
		 		}
		 		if(matriz[i][j]=='B')
		 		{
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"*");
		 		}
		 		if(matriz[i][j]=='R')
		 		{
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"*");
		 		}
		 		if(matriz[i][j]=='b') 
		 		{
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"*");
		 		}
		 		if(matriz[i][j]=='a')
		 		{
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"*");
		 		}
		 		System.out.println(ConsoleColors.RESET);
			}
			System.out.println();
		}
	}
}