import java.util.*;
class courseWork{ 
	
	public static String[][] calculateDBMS(String[][] student){
		
		int temp=0;
		int [] marks= new int[student.length];
		String [] marksString=new String[student.length];
		for (int i = 0; i <student.length; i++){
			marks[i]=Integer.parseInt(student[i][3]);
		}
		
		for (int i = 0; i < marks.length; i++) {     
			for (int j = i+1; j < marks.length; j++) {     
               if(marks[i] < marks[j]) {    
                   temp = marks[i];    
                   marks[i] = marks[j];    
                   marks[j] = temp;    
               }     
            }     
        }
        
      
		for (int i = 0; i <marks.length; i++){
			marksString[i] = Integer.toString(marks[i]);
		}
        

       String[][]temp2=new String[student.length][student[0].length];
       
        for (int i = 0; i <student.length; i++){
			for (int j = 0; j < student.length; j++){
					if(marksString[i].equals(student[j][3])){
						for (int l = 0; l <student[0].length; l++){
								temp2[i][l]=student[j][l];
							}
					}
					else{	
					}	
			}
		}
		student=temp2;

		
		return student;
	}
	
	public static String[][] calculatePRF(String[][] student){
		
		int temp=0;
		int [] marks= new int[student.length];
		String [] marksString=new String[student.length];
		for (int i = 0; i <student.length; i++){
			marks[i]=Integer.parseInt(student[i][2]);
		}
		
		for (int i = 0; i < marks.length; i++) {     
			for (int j = i+1; j < marks.length; j++) {     
               if(marks[i] < marks[j]) {    
                   temp = marks[i];    
                   marks[i] = marks[j];    
                   marks[j] = temp;    
               }     
            }     
        }
        
      
		for (int i = 0; i <marks.length; i++){
			marksString[i] = Integer.toString(marks[i]);
		}
        

       String[][]temp2=new String[student.length][student[0].length];
       
        for (int i = 0; i <student.length; i++){
			for (int j = 0; j < student.length; j++){
					if(marksString[i].equals(student[j][2])){
						for (int l = 0; l <student[0].length; l++){
								temp2[i][l]=student[j][l];
							}
					}
					else{	
					}	
			}
		}
		student=temp2;

		
		return student;
	}
	
	public static void dbmsTable(String [][] student){
		System.out.println("\n-------------------------------------------------------------------------------------");
		System.out.println("|			BEST IN DATABASE MANEGEMENT SYSTEM                          |");
		System.out.println("-------------------------------------------------------------------------------------");
		Scanner input=new Scanner(System.in);
		student=calculateDBMS(student);
		
		System.out.println("+----------+----------------------------------------+--------------------+-------------------------+");
		System.out.printf("%s%-10s%s%-40s%s%-20s%s%-25s%s\n","|","ID","|","Name","|","DBMS marks","|","PRF Marks","|");
		System.out.println("+----------+----------------------------------------+--------------------+-------------------------+");
		
			for (int j = 0; j <student.length; j++){
					System.out.printf("%s%-10s%s%-40s%s%20s%s%25s%s\n","|",student[j][0],"|",student[j][1],"|",student[j][3],"|",student[j][2],"|");
				}
		
			
		
		System.out.println("+----------+----------------------------------------+--------------------+-------------------------+");
		
		
		
		System.out.print("\nDo you want to Go back to main menu? (y/n) : ");
	    char option2 = input.next().charAt(0); 
		 if(option2=='y'){
			return;
		}
	}
	
	public static void prfTable(String [][] student){
		System.out.println("\n-------------------------------------------------------------------------------------");
		System.out.println("|			BEST IN PROGRAMMING FUNDAMENTALS                            |");
		System.out.println("-------------------------------------------------------------------------------------");
		Scanner input=new Scanner(System.in);
		student=calculatePRF(student);
		
		System.out.println("+----------+----------------------------------------+--------------------+-------------------------+");
		System.out.printf("%s%-10s%s%-40s%s%-20s%s%-25s%s\n","|","ID","|","Name","|","PRF marks","|","DBMS Marks","|");
		System.out.println("+----------+----------------------------------------+--------------------+-------------------------+");
		
			for (int j = 0; j <student.length; j++){
					System.out.printf("%s%-10s%s%-40s%s%20s%s%25s%s\n","|",student[j][0],"|",student[j][1],"|",student[j][2],"|",student[j][3],"|");
				}
		
			
		
		System.out.println("+----------+----------------------------------------+--------------------+-------------------------+");
		
		
		
		System.out.print("\nDo you want to Go back to main menu? (y/n) : ");
	    char option2 = input.next().charAt(0); 
		 if(option2=='y'){
			return;
		}
	}

	public static void rankTable(String [][] student){
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("|				     	PRINT STUDENTS RANKS                                 |");
		System.out.println("---------------------------------------------------------------------------------------------");
		Scanner input=new Scanner(System.in);
		String rank=null;
		calculateMarks(student);
		System.out.println("+-----+----------+----------------------------------------+--------------------+-------------------------+");
		System.out.printf("%s%-5s%s%-10s%s%-40s%s%20s%s%25s%s\n","|","Rank","|","ID","|","Name","|","Total Marks","|","Avg. Marks","|");
		System.out.println("+-----+----------+----------------------------------------+--------------------+-------------------------+");
		for (int i = 0; i <student.length; i++){
			rank=String.valueOf(i+1);
			for (int j = 0; j <student.length; j++){
				if(rank.equals(student[j][6])){
					System.out.printf("%s%-5s%s%-10s%s%-40s%s%20s%s%25s%s\n","|",student[j][6],"|",student[j][0],"|",student[j][1],"|",student[j][4],"|",student[j][5],"|");
				}
				else{
				}
			}
		}
		System.out.println("+-----+----------+----------------------------------------+--------------------+-------------------------+");
		
		System.out.print("\nDo you want to Go back to main menu? (y/n) : ");
	    char option2 = input.next().charAt(0); 
		 if(option2=='y'){
			return;
		}
	}
	
	public static String[][] rank(String [][] student){
		double temp=0;
		double [] rankAvg= new double[student.length];
		String [] rankString=new String[student.length];
		for (int i = 0; i <student.length; i++){
			rankAvg[i]=Double.parseDouble(student[i][5]);
		}
		
		for (int i = 0; i < rankAvg.length; i++) {     
			for (int j = i+1; j < rankAvg.length; j++) {     
               if(rankAvg[i] < rankAvg[j]) {    
                   temp = rankAvg[i];    
                   rankAvg[i] = rankAvg[j];    
                   rankAvg[j] = temp;    
               }     
            }     
        }
      
		for (int i = 0; i <student.length; i++){
			rankString[i] = Double.toString(rankAvg[i]);
		}
       
       double[]temp2=new double[student[0].length];
        for (int i = 0; i <rankString.length; i++){
			for (int j = 0; j < student.length; j++){
					if(rankString[i].equals(student[j][5])){
							student[j][6]=String.valueOf(i+1);
							
						}	
			}
		
		}
		
		return student;
	}
	
	public static String [][] calculateMarks(String [][] student){
		//total,average
		for (int i = 0; i <student.length; i++){
			double prf=Double.parseDouble(student[i][2]);
			double dbms=Double.parseDouble(student[i][3]);
			double tot=prf+dbms;
			double avg=tot/2;
			student[i][4]=String.valueOf(tot);
			student[i][5]=String.valueOf(avg);
		}
		student=rank(student);
		return student;
		
	}
	
	public static String [][] printStudentDetails(String [][] student){
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("|				     	PRINT STUDENT DETAILS                               |");
		System.out.println("---------------------------------------------------------------------------------------------");
		Scanner input=new Scanner(System.in);
		double [] rank;
		int index;
		while(true){
			int count=0;
			System.out.print("Eneter Student ID    : ");
			String sId=input.next();
			for (int i = 0; i <student.length; i++){
					if (student[i][0].equals(sId)){
								count++;
					}
				}	
				if(count==0){
					System.out.print("\nInvalid Student ID. Do you want to search agein? (y/n) : ");
					char option = input.next().charAt(0); 
					System.out.println();
					if(option=='n'){
						break;
					}
				}	
				else{
					index=checkId(student,sId);
					System.out.println("Student Name         : "+student[index][1]);
					System.out.println();
					if(student[index][2]==null){
						System.out.println("Marks yet to be added. \n\nDo you want to search another student details? (y/n) : ");
						char option = input.next().charAt(0); 
						if(option=='n'){
							break;
						}
					}
					else{
						String rank2="";
						student=calculateMarks(student);
						int index2 = index+1;
					    String index3 = String.valueOf(index2);
					    if(student[index][6].equals("1")){
							rank2="(First)";
						}
						else if(student[index][6].equals("2")){
							rank2= "(Secound)";
						}
						else if(student[index][6].equals("3")){
							rank2=" (Therd)";
						}
						else if(student[index][6].equals(index3)){
							rank2=" (Last rank)";
						}
						System.out.println("+--------------------------------------------------+----------+");
						System.out.printf("%s%-50s%s%10s%s\n","|","Programming Fundamentals Marks  ","|",student[index][2],"|");
						System.out.printf("%s%-50s%s%10s%s\n","|","Database Managment System Marks   ","|",student[index][3],"|");
						System.out.printf("%s%-50s%s%10s%s\n","|","Total Marks   ","|",student[index][4],"|");
						System.out.printf("%s%-50s%s%10s%s\n","|","Avg. Marks   ","|",student[index][5],"|");
						System.out.printf("%s%-50s%s%10s%s\n","|","Rank   ","|",student[index][6]+rank2,"|");
						System.out.println("+--------------------------------------------------+----------+");

						}
					}
						System.out.print("\nDo you want to search another student details? (y/n) : ");
						char option2 = input.next().charAt(0); 
						if(option2=='n'){
							break;
						}
				}
				return student;
			}
			
	public static String [][] deleteCalculate(String [][] student , int index){
		
		String [][] temp = new String [student.length][7];
		
		for (int i = 0; i <student.length; i++){
			for (int j = 0; j <temp[0].length; j++){
				temp[i][j]=student[i][j];
			}
		}
		
		
		for (int i = index; i <temp.length-1; i++){
			for (int j = 0; j <temp[0].length; j++){
				temp[i][j]=temp[i+1][j];
			}
		}
		
		String[][]newTemp=new String[temp.length-1][7];
		
		for (int i = 0; i <temp.length-1; i++){
			for (int j = 0; j <temp[0].length; j++){
				newTemp[i][j]=temp[i][j];
			}
		}

			student=newTemp;
			return student;
			
	}

	public static String[][] deleteStudent(String [][] student){
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("|				    DELETE STUDENT                                          |");
		System.out.println("---------------------------------------------------------------------------------------------");
		Scanner input = new Scanner(System.in);	
		
		int index;
		while(true){
			int count=0;
			System.out.print("Eneter Student ID    : ");
			String sId=input.next();
			for (int i = 0; i <student.length; i++){
					if (student[i][0].equals(sId)){
								count++;
					}
				}	
				if(count==0){
					System.out.print("\nInvalid Student ID. Do you want to search agein? (y/n) : ");
					char option = input.next().charAt(0); 
					System.out.println();
					if(option=='n'){
						break;
					}
				}	
				else{
					System.out.println("Are you sure you want delete "+sId+" Student Id (y/n) : ");
					char option = input.next().charAt(0); 
					System.out.println();
					if(option=='n'){
						break;
					}
					
					index=checkId(student,sId);
					student=deleteCalculate(student , index);
					System.out.println("Student has been deleted successfully.\nDo you want to delete another student?(y/n) : ");
					char option2 = input.next().charAt(0); 
					System.out.println();
					if(option2=='n'){
						break;
					}
				}
		}
		return student;
	}
	
	public static String [][] updateMarks(String [][] student){
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("|				    UPDATE STUDENT MARKS                                    |");
		System.out.println("---------------------------------------------------------------------------------------------");
		Scanner input = new Scanner(System.in);	
		int index;
		while(true){
			int count=0;
			System.out.print("Eneter Student ID    : ");
			String sId=input.next();
			for (int i = 0; i <student.length; i++){
					if (student[i][0].equals(sId)){
								count++;
					}
				}	
				if(count==0){
					System.out.print("\nInvalid Student ID. Do you want to search agein? (y/n) : ");
					char option = input.next().charAt(0); 
					System.out.println();
					if(option=='n'){
						break;
					}
				}	
				else{
					index=checkId(student,sId);
					System.out.println("Student Name         : "+student[index][1]);
					System.out.println();
					if(student[index][2]==null){
						System.out.println("This student's marks yet to be added. \nDo you want to update the marks of another student?(y/n) : ");
						char option = input.next().charAt(0); 
						if(option=='n'){
							break;
						}
					}
					System.out.println("Programming Fundamentals marks          : "+student[index][2]);
					System.out.println("Database Management System marks        : "+student[index][3]);
					System.out.println();
					System.out.print("Enter the new Programming Fundamentals marks : ");
					String newPrfMarks=input.next();
					student[index][2]=newPrfMarks;
					System.out.print("Enter the new Programming Fundamentals marks : ");
					String newDbmMarks=input.next();
					student[index][3]=newDbmMarks;
					System.out.print("\nStudent details has been updated successfully.\nDo you want to update another student details ? (y/n) :");
					char option = input.next().charAt(0);
					if(option=='n'){
						break;
					}
				}
		}
		return student;
	}
	
	public static String[][] updateStudentDetails(String [][] student){
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("|				     UPDATE STUDENT DETAILS                                 |");
		System.out.println("---------------------------------------------------------------------------------------------");
		Scanner input = new Scanner(System.in);
		int index;
		while(true){
			int count=0;
			System.out.print("Eneter Student ID    : ");
			String sId=input.next();
			for (int i = 0; i <student.length; i++){
					if (student[i][0].equals(sId)){
								count++;
					}
				}	
				if(count==0){
					System.out.print("\nInvalid Student ID. Do you want to search agein? (y/n) : ");
					char option = input.next().charAt(0); 
					System.out.println();
					if(option=='n'){
						break;
					}
				}	
				else{
					index=checkId(student,sId);
					System.out.println("Student Name         : "+student[index][1]);
					System.out.println();
					System.out.print("Enter the new student name : ");
					String newName=input.next();
					student[index][1]=newName;
					System.out.print("\nStudent details has been updated successfully.\nDo you want to update another student details ? (y/n) :");
					char option = input.next().charAt(0);
					if(option=='n'){
						break;
					}
				}
		}
		return student;
	}
	
	public static int checkId(String [][]student,String sId){
		int index=0;
		for (int i = 0; i <student.length; i++){
			if (student[i][0].equals(sId)){
					index=i;
			}
		}
		return index;
	}
	
	public static String [][] addMarks(String [][] student){
		
		System.out.println("\n----------------------------------------------------------------------------------------------");
		System.out.println("|				       ADD MARKS	          		             |");
		System.out.println("----------------------------------------------------------------------------------------------");
		String dbmsMarks;
		String prfMarks;
		
		int index;
			while(true){
			int count=0;
			Scanner input = new Scanner(System.in);
			System.out.print("\nEneter Student ID    : ");
			String sId=input.next();
			for (int i = 0; i <student.length; i++){
				if (student[i][0].equals(sId)){
							count++;
				}
			}	
			if(count==0){
				System.out.print("Invalid Student ID. Do you want to search agein? (y/n) : ");
				char option = input.next().charAt(0); 
				if(option=='n'){
					break;
				}
			}	
			else{
				index=checkId(student,sId);
				System.out.println("Student Name         : "+student[index][1]);
				System.out.println();
				
				if(student[index][2]!=null){
					System.out.println("This student marks have been already added.\nIf you want to update the marks, please use [4] Update Marks option");
					System.out.print("\nDo you want to add marks for another Student? (y/n) : ");
					char option = input.next().charAt(0); 
					if(option=='n'){
						break;
					}
					else if(option=='y'){
						clearConsole();
					}
				}
				else{
					while(true){
						System.out.print("Programming Fundamentals marks      : ");
						prfMarks=input.next();
						boolean b=checkMarks(prfMarks);
						if(b==true){
							student[index][2]=prfMarks;
							break;
						}
						else if(b==false){
							System.out.print("Invalid marks. please enter correct marks ");
							System.out.println();	
						}
					}
					
					while(true){
						System.out.print("Database Management System marks    : ");
						dbmsMarks=input.next();
						boolean b=checkMarks(dbmsMarks);
						if(b==true){
								student[index][3]=dbmsMarks;
								break;
						}
						else if(b==false){
							System.out.print("Invalid marks. please enter correct maeks ");
							System.out.println();	
						}
						
					}
				}
			}
				System.out.print("Marks have been added. do you want to add marks for another student (y/n) : ");
				char option = input.next().charAt(0); 
					if(option=='n'){
						break;
					}
			
		}
		return student;	
	}
	
	public static boolean checkMarks(String marks){
		double castMarks=Double.parseDouble(marks);
		boolean b;
		if((castMarks>=0) & (castMarks<= 100)){
			b=true;
		}
		else{
			b=false;
		}
	return b;
		
	}
	
	public static String [][]addStudentWithMarks(String [][] student){
		Scanner input=new Scanner(System.in);
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("|				ADD NEW STUDENT	WITH MARKS	     		            |");
		System.out.println("---------------------------------------------------------------------------------------------");
		String dbmsMarks;
		String prfMarks;
		while(true){
			int count=0;
			System.out.print("\nEneter Student ID      : ");
			String id=input.next(); 
			for (int i = 0; i <student.length; i++){
				if (student[i][0].equals(id)){
						count++;
				}
			}	
			if(count==0){
				System.out.print("Eneter Student Name    : ");
				String name=input.next(); 
				System.out.println();
				    while(true){
						System.out.print("Programming Fundamentals marks      : ");
						prfMarks=input.next();
						boolean b=checkMarks(prfMarks);
						if(b==true){
							break;
						}
						else if(b==false){
							System.out.print("Invalid marks. please enter correct marks ");
							System.out.println();	
						}
					}
					
					while(true){
						System.out.print("Database Management System marks    : ");
						dbmsMarks=input.next();
						boolean b=checkMarks(dbmsMarks);
						if(b==true){
								break;
						}
						else if(b==false){
							System.out.print("Invalid marks. please enter correct maeks ");
							System.out.println();	
						}
						
					}
				student=extendArray(student,id,name,prfMarks,dbmsMarks);
				System.out.print("\nStudent has been added successfully. Do you want to add new Student (y:n) > ");
				char option = input.next().charAt(0);
				if(option=='n'){
					break;
				}
			}
			else{
				System.out.print("The Student ID already exeists!");
				System.out.println();
			}	
			

		}
		
		return student;
		
	}
	
	public static String [][] extendArray(String [][]student, String id,  String name, String prfMarks, String dbmsMarks){
		String [][] temp = new String [student.length+1][7];
			for (int i = 0; i <student.length; i++){
				for (int j = 0; j < student[0].length; j++){
					temp[i][j]=student[i][j];
				}
			}

			temp[student.length][0]=id;
			temp[student.length][1]=name;
			temp[student.length][2]=prfMarks;
			temp[student.length][3]=dbmsMarks;
	
			student=temp;
			return student;
			
	}
	
	public static String [][] addNewStudent(String [][]student){
		Scanner input=new Scanner(System.in);
		System.out.println("\n-------------------------------------------------------------------------------------");
		System.out.println("|				ADD NEW STUDENT		     		            |");
		System.out.println("-------------------------------------------------------------------------------------");
		
		while(true){
			int count=0;
			System.out.print("\nEneter Student ID      : ");
			String id=input.next(); 
			for (int i = 0; i <student.length; i++){
				if (student[i][0].equals(id)){
						count++;
				}
			}	
			if(count==0){
				System.out.print("Eneter Student Name    : ");
				String name=input.next(); 
				student=extendArray(student,id,name,null,null);
				System.out.print("\nDo you want to add new Student (y:n) > ");
				char option = input.next().charAt(0);
				if(option=='n'){
					break;
				}
			}
			else{
				System.out.print("The Student ID already exeists!");
				System.out.println();
			}	
			

		}
		return student;
	}
	
	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
		}
	}
	
	public static void main(String args[]){
		//Arrays
		String [][] student=new String [0][7];
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|			WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                     |");
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("[1] Add New Student                         [2] Add New Student With Marks");
			System.out.println("[3] Add Marks                               [4] Update Student Details");
			System.out.println("[5] Update Marks                            [6] Delete Student");
			System.out.println("[7] Print Student Details                   [8] Print Student Ranks");
			System.out.println("[9] Best in Programming Fundamentals        [10] Best in Database Management System");
			System.out.print("\nEnter an option to continue > ");
			int option = input.nextInt();
			clearConsole();
			
			if(option==1){
				student=addNewStudent(student);
				clearConsole();
			}
			else if(option==2){
				student=addStudentWithMarks(student);
				clearConsole();
			}
			else if(option==3){
				student=addMarks(student);
				clearConsole();
			}
			else if(option==4){
				student=updateStudentDetails(student);
				clearConsole();
			}
			else if(option==5){
				student=updateMarks(student);
				clearConsole();
			}
			else if(option==6){
				student=deleteStudent(student);
				clearConsole();
			}
			else if(option==7){
				student=printStudentDetails(student);
				clearConsole();
			}
			else if(option==8){
				rankTable(student);
				clearConsole();
			}
			else if(option==9){
				prfTable(student);
				clearConsole();
			}
			else if(option==10){
				dbmsTable(student);
				clearConsole();
			}
		}
		
	}
}
