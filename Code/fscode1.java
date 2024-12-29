search by ward 

try
			     {
			      if(((String) comboBox.getSelectedItem()).length()!=0)
			      {
			       
			       BufferedReader brSearch2 = new BufferedReader( new FileReader("patient.txt") );
			      
			       
			      
			       String recordSearch;
			       String patientdetail[]=new String[1024];
			       
			      
			       
			       int i=0;
			       while( ( recordSearch = brSearch2.readLine() ) != null )
			       {
			        StringTokenizer st = new StringTokenizer(recordSearch,"|");
			        if( recordSearch.contains(ward) )
			        {        
			         patientdetail[i]="ID = "+st.nextToken()+" \tFirst Name = "+st.nextToken()+"\t Last name = "+st.nextToken()+"\t Address= "+st.nextToken()+"\tDoctor="+st.nextToken()+"\tWard="+st.nextToken()+"\tGender="+st.nextToken()+"\n";
			      
			         
			         i++;
			         
			        }
			       }
			   	
			      for(int k=0;k<i;k++)
			       {
			    	   textArea.append(patientdetail[k]);
			    	   System.out.println( patientdetail[k]);
			    	   
			       }
			       brSearch2.close();
			      }
			     }
			     catch(Exception ex)
			     {
			      System.out.println("Exception msg: "+ex);
			     }
















search by from 

try
			     {
			      if(textField.getText().length()!=0)
			      {
			       
			       BufferedReader brSearch2 = new BufferedReader( new FileReader("patient.txt") );
			       textField.setText("");
			       
			      
			       String recordSearch;
			       String patientdetail[]=new String[1024];
			       
			      
			       
			       int i=0;
			       while( ( recordSearch = brSearch2.readLine() ) != null )
			       {
			        StringTokenizer st = new StringTokenizer(recordSearch,"|");
			        if( recordSearch.contains(address) )
			        {        
			         patientdetail[i]="ID = "+st.nextToken()+" \tFirst Name = "+st.nextToken()+"\t Last name = "+st.nextToken()+"\t Address= "+st.nextToken()+"\tDoctor="+st.nextToken()+"\tWard="+st.nextToken()+"\tGender="+st.nextToken()+"\n";
			      
			         
			         i++;
			         
			        }
			       }
			   	textField.setText("");
			      for(int k=0;k<i;k++)
			       {
			    	   textArea.append(patientdetail[k]);
			    	   System.out.println( patientdetail[k]);
			    	   
			       }
			       brSearch2.close();
			      }
			     }
			     catch(Exception ex)
			     {
			      System.out.println("Exception msg: "+ex);
			     }
				
