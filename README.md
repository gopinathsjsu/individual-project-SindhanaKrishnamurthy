<h1> CMPE 202 - Individual Project </h1> 
<p> <b> Name : </b> Sindhana Krishnamurthy </p>
<p> <b> SJSU ID : </b> 015418871 </p>
<h2> Instructions </h2>
<p> Environment requirements : Eclipse IDE </p>
<ol> 
  
  <li> Download the file by clicking Code -> Download ZIP on github repository </li>
  <li> Once downloaded, extract the .zip file and copy the entire folder <b>Individual_Project_Final</b> into your Eclipse workspace.</li>
  <li> Now, open Eclipse and go to File -> Import -> General -> Existing Projects into Workspace </li>
  <li> In the next window, choose the <b>Individual_Project_Final folder</b> as your root directory and click "Finish"</li>
  <li> Now, the project is imported </li>
  <li> Add the input files into your workspace where this project resides.</li>
  <li> Choose <b>Customer.java</b> and run this file. This is the file containing main().</li>
  <li> User will be prompted to "Enter the file name :" , enter the relevant input file name </li>
  <li> Project will run successfully and the corresponding output.csv or error.txt files will be created in the same project folder structure in the workspace.</li>
 
</ol>

<h2> Design Patterns Used </h2>
<h3> 1. Iterator Design Pattern </h3>
<p> Iterator design pattern is a behavioural design pattern that is used to iterate through a group of objects without exposing its underlying structure.
We have two interfaces here, one as the iterator and the other one to ierator the entire collection, in this case, the shopping cart of the customer. 
Two classes implement the each of the corresponding iterators. One of them iterates through the cart items that is read as an Array List of objects and other is used to validate this against the static database that we maintain as a HashMap. They ar eused to implement the various validations required and also to calculate the cost of the items provided the cart is valid. </p>

! [image](https://user-images.githubusercontent.com/80934688/144786263-9a2d1760-e622-4e02-b7ec-cc710e9bfa61.png)


<h3> 2. Singleton Design Pattern </h3>
  <p> Singleton design pattern is a creational design pattern that is used to restrict the instantiation of a class and ensures only one instance of the class exists in the JVM. We use this design pattern while making a payment using the credit card and adding it to the static database maintained as an arraylist if it doesn't exist. We have one private constructor, a private static variable and a public method to restrict access while also letting the customer make a payment.</p>
