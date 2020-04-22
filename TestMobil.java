public class TestMobil {
	
	public static void main(String[] args){
		Mobil mobil = new Mobil(){
			public void injakPedalGas(){
				System.out.println("Mobil berjalan...");
			}

			@Override
			public int berukuran(int ukuran) {
				// TODO Auto-generated method
				return ukuran*10;
			}

			@Override
			public int berkekuatan(int kekuatan) {
				// TODO Auto-generated method
				 return kekuatan*10;
			}
		};
		
		Kijang kijang = new Kijang();
		BMW bmw = new BMW();
		mobil.injakPedalGas();
		
		System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(100)+ "\nBerukuran : " + mobil.berukuran(100)); 
		
		mobil = kijang;
		mobil.injakPedalGas();
		System.out.println("Kekuatan Kijang: "+ mobil.berkekuatan(150)+"\nBerukuran : "+ mobil.berukuran(100));
		
		mobil = bmw;
		mobil.injakPedalGas();
		System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(150)+"\nBerukuran : " + mobil.berukuran(100));
	}
}
