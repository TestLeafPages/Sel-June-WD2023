Todays Agenda:
===============
   09:30-10:00->Parameterzation(dataproivder)
   10:00-10:30->Classroom +break
   10:30-11:00->POM with Cucumber
   11:00-11:20->break
   11:20-12:30->POM with TestNG and Cucumber(ThreadLocal)
  

How to Parameterize the data?
	  1)Create a new package(utils) and copy the ReadExel class from the previous project 
	  and paste it here and check with package name
	  2)Create a data folder and create excel sheets
	  3)Declare the ExcelFileName globally
	  4)Create a method for @DataProvider and call the ReadExel class
	  5)Integrate @Test with dataProvider attribute
	  6)Pass the inputs as arguments in the testcase method level and replace the hardcoded values
	  7)In the testcase create a method to mention the ExcelFileName and annotate with @BeforeTest
	  


TestNG- i cannot use static keyword in parallel
overcome to parallel exc we have go constructor call each pages


cucumber -i cannot have any constructor insides stepdef 
overcome as driver as static 




  ThreadLocal Concept:
=========================

Thread safety when working with variable ina multithreaded environment .it allows you to store and retrieve values  that are specific to the current thread,

-Java Class to create variable which can be used to read and write within a single thread.
ThreadLocal implementation of Webdriver will support
TestNG parallel execution and cucumber

DisAdvantage:

As the constructor call is not allowed in cucumber 

To acheive parallel execution without constructor in cucumber

==============================

To support both cucumberand TestNG

---supportsequential execution of both TestNG and cucumber

--not ableto use for parallel executionof TestNG because cucumber is not supporting driver to be passed inthe constructor.



Add ThreadLocalclass in Basecall method
private static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();
	
	
	public void setDriver() {
		tldriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return tldriver.get();
	}

add setDriver() method to @BeforeMethod

Remove the constructor from all the pages

Change the driver to getDriver() in all the actions in the pages 