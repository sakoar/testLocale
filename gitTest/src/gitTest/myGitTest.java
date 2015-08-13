package gitTest;

import org.testng.annotations.Test;


public class myGitTest {

	HappyHour check = new HappyHour();
		
	@Test
  public void testGit() {
	  check.sum(10,30);
	  System.out.println("Managing Git with Eclipse");
	  System.out.println("This is another change");
	  
	  
  }
}
