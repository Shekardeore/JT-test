package JTtest;

import java.util.Scanner;

class HatchBack implements CarServices{

	public int BS=0;
	public int EF=0;
	public int CF=0;
	public int BF=0;
	public int GF=0;
	public int Total=0;
	
	public HatchBack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HatchBack(int bS, int eF, int cF, int bF, int gF, int total) {
		super();
		BS = bS;
		EF = eF;
		CF = cF;
		BF = bF;
		GF = gF;
		Total = total;
	}

	public int getBS() {
		return BS;
	}

	public void setBS(int bS) {
		BS = bS;
	}

	public int getEF() {
		return EF;
	}

	public void setEF(int eF) {
		EF = eF;
	}

	public int getCF() {
		return CF;
	}

	public void setCF(int cF) {
		CF = cF;
	}

	public int getBF() {
		return BF;
	}

	public void setBF(int bF) {
		BF = bF;
	}

	public int getGF() {
		return GF;
	}

	public void setGF(int gF) {
		GF = gF;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	@Override
	public void BasicService(int amount) {
		this.BS=amount;
	}

	@Override
	public void EngineFixing(int amt1) {
		this.EF=amt1;
	}

	@Override
	public void ClutchFixing(int amt2) {
	   this.CF=amt2;
	}

	@Override
	public void BrakeFixing(int amt3) {
		this.BF=amt3;
	}

	@Override
	public void GearFixing(int amt4) {
		// TODO Auto-generated method stub
		this.GF=amt4;
	}

	@Override
	public void TotalAmount() {
	     this.Total=BS+EF+CF+BF+GF;
	     System.out.println("The total amount is = "+Total);
	}
	
}

class Sedan implements CarServices{

	public int BS=0;
	public int EF=0;
	public int CF=0;
	public int BF=0;
	public int GF=0;
	public int Total=0;
	
	
	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sedan(int bS, int eF, int cF, int bF, int gF, int total) {
		super();
		BS = bS;
		EF = eF;
		CF = cF;
		BF = bF;
		GF = gF;
		Total = total;
	}

	public int getBS() {
		return BS;
	}

	public void setBS(int bS) {
		BS = bS;
	}

	public int getEF() {
		return EF;
	}

	public void setEF(int eF) {
		EF = eF;
	}

	public int getCF() {
		return CF;
	}

	public void setCF(int cF) {
		CF = cF;
	}

	public int getBF() {
		return BF;
	}

	public void setBF(int bF) {
		BF = bF;
	}

	public int getGF() {
		return GF;
	}

	public void setGF(int gF) {
		GF = gF;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	@Override
	public void BasicService(int amount) {
		//setBS(2000);
		//System.out.println("The amount for Basic Service ");
		//Total=BS;
		this.BS=amount;
	}

	@Override
	public void EngineFixing(int amt1) {
		this.EF=amt1;
	}

	@Override
	public void ClutchFixing(int amt2) {
	   this.CF=amt2;
	}

	@Override
	public void BrakeFixing(int amt3) {
		this.BF=amt3;
	}

	@Override
	public void GearFixing(int amt4) {
		// TODO Auto-generated method stub
		this.GF=amt4;
	}

	@Override
	public void TotalAmount() {
	     this.Total=BS+EF+CF+BF+GF;
	     System.out.println("The total amount is = "+Total);
	}
}


class SUV implements CarServices{

	public int BS=0;
	public int EF=0;
	public int CF=0;
	public int BF=0;
	public int GF=0;
	public int Total=0;
	
	
	public SUV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SUV(int bS, int eF, int cF, int bF, int gF, int total) {
		super();
		BS = bS;
		EF = eF;
		CF = cF;
		BF = bF;
		GF = gF;
		Total = total;
	}

	public int getBS() {
		return BS;
	}

	public void setBS(int bS) {
		BS = bS;
	}

	public int getEF() {
		return EF;
	}

	public void setEF(int eF) {
		EF = eF;
	}

	public int getCF() {
		return CF;
	}

	public void setCF(int cF) {
		CF = cF;
	}

	public int getBF() {
		return BF;
	}

	public void setBF(int bF) {
		BF = bF;
	}

	public int getGF() {
		return GF;
	}

	public void setGF(int gF) {
		GF = gF;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	@Override
	public void BasicService(int amount) {
		//setBS(2000);
		//System.out.println("The amount for Basic Service ");
		//Total=BS;
		this.BS=amount;
	}

	@Override
	public void EngineFixing(int amt1) {
		this.EF=amt1;
	}

	@Override
	public void ClutchFixing(int amt2) {
	   this.CF=amt2;
	}

	@Override
	public void BrakeFixing(int amt3) {
		this.BF=amt3;
	}

	@Override
	public void GearFixing(int amt4) {
		// TODO Auto-generated method stub
		this.GF=amt4;
	}

	@Override
	public void TotalAmount() {
	     this.Total=BS+EF+CF+BF+GF;
	     System.out.println("Total Bill –  "+Total);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Select the Cars Type ");
		System.out.println("1.HatchBak \n 2.Sedan \n 3.SUV");
		
		switch(sc.nextInt()){
		case 1:
			System.out.println("For the HatchBak car \n please select the Services");
			System.out.println("1.Basic Service(BS01)\n 2.Engine Fixing(EF01) \n 3.Clutch Fixing(CF01) \n 4. Break Fixing(BF01) \n 5.Gear Fixing(GF01) ");
			int i=1;
			HatchBack hb = new HatchBack();
			
			do {
				System.out.println("1.Basic Service(BS01)\n 2.Engine Fixing(EF01) \n 3.Clutch Fixing(CF01) \n 4. Break Fixing(BF01) \n 5.Gear Fixing(GF01) ");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Charges for Basic Servicing –  2000");
					hb.BasicService(2000);
					break;
				case 2: 
					System.out.println("Charges for Engine Fixing  –  5000");
					hb.EngineFixing(5000);
					break;
				case 3: 
					System.out.println("Charges for Clutch Fixing  –  2000");
					hb.ClutchFixing(2000);
					break;

				case 4: 
					System.out.println("Charges for Break Fixing  –  1000");
					hb.BrakeFixing(1000);
					break;

				case 5: 
					System.out.println("Charges for Gear Fixing  –  3000");
					hb.GearFixing(3000);
					break;

				}
				System.out.println("Do you want to continue press 1 for yes press 0 for no ");
				i=sc.nextInt();
			}while(i!=0);
			System.out.println("----------");
			hb.TotalAmount();
			System.out.println("Thank you !!! Visit again");
			break;				
			
		case 2:
			System.out.println("For the Sedan  car \nplease select the Services");
			System.out.println("1.Basic Service(BS01)\n 2.Engine Fixing(EF01) \n 3.Clutch Fixing(CF01) \n 4. Break Fixing(BF01) \n 5.Gear Fixing(GF01) ");
			int j=1;
			Sedan sd =new Sedan();
			
			do {
				System.out.println("1.Basic Service(BS01)\n 2.Engine Fixing(EF01) \n 3.Clutch Fixing(CF01) \n 4. Break Fixing(BF01) \n 5.Gear Fixing(GF01) ");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Charges for Basic Servicing –  4000");
					sd.BasicService(4000);
					break;
				case 2: 
					System.out.println("Charges for Engine Fixing  –  8000");
					sd.EngineFixing(8000);
					break;
				case 3: 
					System.out.println("Charges for Clutch Fixing  –  4000");
					sd.ClutchFixing(4000);
					break;

				case 4: 
					System.out.println("Charges for Break Fixing  –  1500");
					sd.BrakeFixing(1500);
					break;

				case 5: 
					System.out.println("Charges for Gear Fixing  –  6000");
					sd.GearFixing(6000);
					break;

				}
				System.out.println("Do you want to continue press 1 for yes press 0 for no ");
				i=sc.nextInt();
			}while(j!=0);
			System.out.println("----------");
			sd.TotalAmount();
			System.out.println("Thank you !!! Visit again");
			break;
		case 3:
			System.out.println("For the Sedan  car \nplease select the Services");
			System.out.println("1.Basic Service(BS01)\n 2.Engine Fixing(EF01) \n 3.Clutch Fixing(CF01) \n 4. Break Fixing(BF01) \n 5.Gear Fixing(GF01) ");
			int k=1;
			SUV s= new SUV();
			
			do {
				System.out.println("1.Basic Service(BS01)\n 2.Engine Fixing(EF01) \n 3.Clutch Fixing(CF01) \n 4. Break Fixing(BF01) \n 5.Gear Fixing(GF01) ");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Charges for Basic Servicing –  5000");
					s.BasicService(5000);
					break;
				case 2: 
					System.out.println("Charges for Engine Fixing  –  10000");
					s.EngineFixing(10000);
					break;
				case 3: 
					System.out.println("Charges for Clutch Fixing  –  6000");
					s.ClutchFixing(6000);
					break;

				case 4: 
					System.out.println("Charges for Break Fixing  –  2500");
					s.BrakeFixing(2500);
					break;

				case 5: 
					System.out.println("Charges for Gear Fixing  –  8000");
					s.GearFixing(8000);
					break;

				}
				System.out.println("Do you want to continue press 1 for yes press 0 for no ");
				i=sc.nextInt();
			}while(k!=0);
			System.out.println("----------");
			s.TotalAmount();
			System.out.println("Thank you !!! Visit again");
			break;
		}
	}
}
