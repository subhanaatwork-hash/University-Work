import java.util.Scanner;
	public class mockMid{
		public static void main (String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("           === Islamabad Season Predictor ===");
	
	System.out.println("Enter the daytime temperature(degrees celcius):");
	int daytimeTemp = sc.nextInt();

	System.out.println("Enter the nighttime temperature(degrees celcius):");
	int nighttimeTemp = sc.nextInt();

	do{

	if (daytimeTemp >=10 && daytimeTemp <= 20  && nighttimeTemp >=10){
	System.out.println("Predicted Season is Winter.");
	}
	else if (daytimeTemp >=24 && daytimeTemp <= 27  && nighttimeTemp>= 14 && nighttimeTemp <= 17){
	System.out.println("Predicted Season is Spring.");	
	}
	else if (daytimeTemp >=36 && daytimeTemp <= 39  && nighttimeTemp >=20 && nighttimeTemp <=26){
	System.out.println("Predicted Seasonn is Pre-Monsoon.");
	}
	else if (daytimeTemp >=32 && daytimeTemp <=35  && nighttimeTemp >=26 && nighttimeTemp <=27){
	System.out.println("Predicted Season is Monsoon.");
	}
	else if (daytimeTemp >=21 && daytimeTemp <= 23  && nighttimeTemp >=10 && nighttimeTemp <= 13){
	System.out.println("Predicted Season is Autumn/ Post- Monsoon.");
	}
	else{
	System.out.println("Wrong Value. Enter a valid temperature:");
	}
	}

	while(response){
	System.out.println("Do you wish to Continue(C) or Exit(E)?");
        String response = sc.next();

	if(response("C")){
	response = true;
	}else{
	response = false;
	}
}
	

	

}
}



	