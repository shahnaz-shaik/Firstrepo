public class Shan {
	public static void main(String[] args) {
		int a[][]= {{1,31,3},{4,5,6},{3,8,549}};
		int b[][]= {{9,8,7},{31,556,4},{31,2,1}};
		int exist=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				exist=0;
				for(int x=0;x<b.length;x++) {
					
					for(int y=0;y<b[x].length;y++) {
						if(a[i][j]==b[x][y]) {
							System.out.println(a[i][j]);
							exist=1;
							
						}
						if(exist==1) {
							break;
						}
						
					}
					
					

				}

			}
		}
	}

}
