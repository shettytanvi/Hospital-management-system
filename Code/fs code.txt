//adding
try
				{
					
					//if(patientid.getText().length()!=0&&pfname.getText().length()!=0&&plname.getText().length()!=0&&padd.getText().length()!=0&&pdoctor.getText().length()!=0&&comboBox.getSelectedItem().toString().equals(selectward))
					//{
						BufferedWriter bW1=new BufferedWriter(new FileWriter("patient.txt",true));
					bW1.write(pid+"|"+fname+"|"+lname+"|"+address+"|"+doctor+"|"+ward+"|"+gender+"|$\n");
					//bW1.write("\n");
					bW1.close();
					textArea.setForeground(Color.GREEN);
					textArea.setText("Added Details Successfully\n");
					
					
					patientid.setText("");
					pfname.setText("");
					plname.setText("");
					padd.setText("");
					pdoctor.setText("");
							
					
					//}
					
					
				
				}
				catch(Exception ex)
				{
					System.out.println("file not found");
				}
				
			}
		});


//view


try
		{
		 BufferedReader bR1 = new BufferedReader( new FileReader("patient.txt") ); 
	       String record2;
	       
	       int i=0;
	       String DisplayView1[]=new String[1024];
	       while( ( record2 = bR1.readLine() ) != null )
	       {
	    	   System.out.println(record2);
	    	 // String[] fields=record2.split(record2, '$');
	    	 //  System.out.println(fields[0]+""+fields[1]+""+fields[2]+""+fields[3]+""+fields[4]+""+fields[5]+""+fields[6]+""+fields[7]);
	    	   //FsMiniProjectController record=new FsMiniProjectContrller(fields[0],fields[1],fields[2],fields[3],fields[4],fields[5],fields[6],fields[7]);
	    	   //System.out.println(record2);
	       StringTokenizer st = new StringTokenizer(record2,"|");
	       // System.out.println(st.nextToken());
	        
	        String id=st.nextToken();
	        String fname=st.nextToken();
	       String lname=st.nextToken();
	       String add=st.nextToken();
	       String doc=st.nextToken();
	       String ward=st.nextToken();
	       String gender=st.nextToken();
	        
	        System.out.println(id+" "+fname+" "+lname+" "+add+" "+doc+" "+ward+" "+gender);
	        
	      DisplayView1[i]="ID="+id+"\tFirst Name= "+fname+" \t Last Name="+lname+"\t Address= "+add+"\tDoctor= "+doc+"\tWard= "+ward+"\tGender= "+gender+"\n";
	        
	      textArea.append(DisplayView1[i]);
	        i++;
	       }
	       bR1.close();
		}catch(Exception e) 
		{
			
		}



//search name



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
			        if( recordSearch.contains(name) )
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


//sort


for(int i=0;i<rec;i++)
		       {
		       	for(int j=0;j<rec-i-1;j++)
		       	{
		       		if(id[j].compareTo(id[j+1])>0)
		       		{
		       			System.out.println("inside for");
		       			String tempid=id[j];
		    			id[j]=id[j+1];
		    			id[j+1]=tempid;
		    			
		    			String tempfname=fname[j];
		    			fname[j]=fname[j+1];
		    			fname[j+1]=tempfname;
		    			
		    			String templname=lname[j];
		    			lname[j]=lname[j+1];
		    			lname[j+1]=templname;
		    			
		    			String tempadd=add[j];
		    			add[j]=add[j+1];
		    			add[j+1]=tempadd;
		    			
		    			String tempdoc=doc[j];
		    			doc[j]=doc[j+1];
		    			doc[j+1]=tempdoc;
		    			
		    			String tempward=ward[j];
		    			ward[j]=ward[j+1];
		    			ward[j+1]=tempward;
		    			
		    			String tempgender=gender[j];
		    			gender[j]=gender[j+1];
		    			gender[j+1]=tempgender;
		    			
		    		}
		       	}
		       }



deetee



try
				{
					 File tempDB = new File("patient_temp.txt");
				      File db = new File("patient.txt");
				      
				      
				      BufferedReader br2 = new BufferedReader( new FileReader( db ) );
				      BufferedWriter bw2 = new BufferedWriter( new FileWriter( tempDB ) );
				     
				      
				
				      String record1;
					while( ( record1 = br2.readLine() ) != null ) {
						System.out.println(record1);
				       
				       
				       if( record1.contains(Did) )
				        continue;
				     
				       bw2.write(record1);          
				       bw2.flush();                
				       bw2.newLine();                    
				   
				      }
				      
				      br2.close();
				      bw2.close();
				      
				      db.delete();
				      
				      //tempDB.renameTo(db);
				      
				      boolean success = tempDB.renameTo(db);
				      textArea = new TextArea();
						textArea.setBounds(25, 193, 380, 58);
						delete.getContentPane().add(textArea);
						textArea.setEditable(false);
						textArea.append("Successfully deleted");
						textField.setText("");
				}
				catch(Exception e3)
				{
				System.out.println("error");
				}













