import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public Main(){}

	public static void main(String[] args){
		String script="";
		String scriptName="";
		if(args.length<1){System.out.println("specify a file name"); return;}
		else{scriptName=args[0];}
		try{script=ReadFile(scriptName);}
		catch(FileNotFoundException ex){System.out.println("file not found"); return;}

		int d=0;
		ArrayList<Integer> s=new ArrayList<Integer>();
		boolean devMode=false;
		if(args.length>1){devMode=true;}

		while(d<script.length()){
			if(script.charAt(d)=='Q'){ //push
				if(d+1<script.length()){
					d++;
					if(script.charAt(d)=='Q'){s.add(0,0);}
					else if(script.charAt(d)=='W'){s.add(0,1);}
					else if(script.charAt(d)=='E'){s.add(0,2);}
					else if(script.charAt(d)=='R'){s.add(0,3);}
					else if(script.charAt(d)=='T'){s.add(0,4);}
					else if(script.charAt(d)=='Y'){s.add(0,5);}
					else if(script.charAt(d)=='U'){s.add(0,6);}
					else if(script.charAt(d)=='I'){s.add(0,7);}
					else if(script.charAt(d)=='O'){s.add(0,8);}
					else if(script.charAt(d)=='P'){s.add(0,9);}
				}
				if(devMode){System.out.println("("+s.get(0)+")");}
			} 

			else if(script.charAt(d)=='W'){if(s.size()>0){s.remove(0);}} //pop

			else if(script.charAt(d)=='E'){if(s.size()>0){System.out.print(s.get(0));}} //print num

			else if(script.charAt(d)=='R'){ //print char
				if(s.size()>0){System.out.print(Character.toString(s.get(0)));}
			}

			else if(script.charAt(d)=='T'){//add
				if(s.size()>1){
					s.add(0,s.get(0)+s.get(1));
					s.remove(1);
					s.remove(1);
				}
				if(devMode){System.out.println("("+s.get(0)+")");}
			}

			else if(script.charAt(d)=='Y'){//subtract
				if(s.size()>1){
					s.add(0,s.get(1)-s.get(0));
					s.remove(1);
					s.remove(1);
				}
				if(devMode){System.out.println("("+s.get(0)+")");}
			}

			else if(script.charAt(d)=='U'){//multiply
				if(s.size()>1){
					s.add(0,s.get(0)*s.get(1));
					s.remove(1);
					s.remove(1);
				}
				if(devMode){System.out.println("("+s.get(0)+")");}
			}
			
			else if(script.charAt(d)=='I'){//divide
				if(s.size()>1){
					s.add(0,s.get(1)/s.get(0));
					s.remove(1);
					s.remove(1);
				}
				if(devMode){System.out.println("("+s.get(0)+")");}
			}

			else if(script.charAt(d)=='O'){//modulus
				if(s.size()>1){
					s.add(0,s.get(0)%s.get(1));
					s.remove(1);
					s.remove(1);
				}
				if(devMode){System.out.println("("+s.get(0)+")");}
			}

			else if(script.charAt(d)=='P'){
				if(s.size()>0){
					s.add(0,s.get(0));
				}
			}
						
			d++;
		}
	}

	public static String ReadFile(String fileName) throws FileNotFoundException{
		File  file=new File(fileName);
		Scanner sc=new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
}
