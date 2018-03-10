
public class Letsmakeadictionaryorder {

	BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	
	Integer n = Integer.valueOf(cin.readLine());
	
	String[] str = new String[n];
	for(int i =0; i < n; i++){
	str[i] = cin.readLine();
}
Arrays.sort(str);
for(int i = 0; i < n; i++){
    System.out.println(str[i]);
}

}
}


}
