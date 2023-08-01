 
public class MyArrayList<E> 
{
  private int size; // Number of elements in the list
  private E[] data;
  /** Create an empty list */
  public MyArrayList() {
	   data = (E[])new Object[100];// cannot create array of generics
       size = 0; // Number of elements in the list
  }
  
  public void add(int index, E e) {   
    // Ensure the index is in the right range
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size); 
    // Move the elements to the right after the specified index
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];
    // Insert new element to data[index]
    data[index] = e;
    // Increase size by 1
    size++;
  }

  public boolean contains(Object e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return true;
    return false;
  }
  
  
  /* Two new methods*/
 
public void checkChar(char a, char c, char b)
{
	 int LETTER_WORDS =5;
  int numberguess=5;
  
	char[] charcheck = new char [5];
	charcheck[0] = 'A';
	charcheck[1] = 'D';
	charcheck[2]='M';
	charcheck[3]='I';
	charcheck[4]='N';
	
	/*charcheck[0] = 'A';
	charcheck[1] = 'D';
	charcheck[2]='M';
	charcheck[3]='I';
	charcheck[4]='N'; */
	
	
	
 char[] checkArray ={'A','B','C'};
 
 boolean valid =true ;
	boolean invalid =false; ;
	
	if(a=='A')
	{
		valid = true;
	}
	
	if(b=='B')
	{
		valid = true;
	}
	if(c=='C')
	{
		invalid = false;
	}
	
	
	//receive a 5-letter word and
//return an array list with characters of your own choosing

for(int i=0;i<5;i++)
{
}
return;


}

public boolean checkWin(char a, char b, char c)
{
	int Positions = 5 ;
	int box = 0;
	 int invalid =0;
	 int valid =1;
	 char[] checkArray ={'A','B','C'};
	 
	 char[] charcheck = new char [5];
	charcheck[0] = 'A';
	charcheck[1] = 'D';
	charcheck[2]='M';
	charcheck[3]='I';
	charcheck[4]='N';
	
	 System.out.println(" You win");
	 System.out.println("You lose");
	if(Positions == 0)
	{
		return true;
	}
	
	if(Positions ==1)
	{
		return true;
	}
	
	if(Positions ==2)
	{
		return true;
	}
	if(Positions ==3)
	{
		return true;
	}
	if(Positions ==4)
	{
		return true;
	}
	if(Positions ==5)
	{
		return false;
	}
	else
	{
		return true;
	}
	
	
	
	
	
	
	// need to return True if all
//the characters in the array are valid and in their correct positions.
}

  public E get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    return data[index];
  }
  
  public E remove(int index) {
	if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    E e = data[index];
    // Shift data to the left
    for (int j = index; j < size - 1; j++)
      data[j] = data[j + 1];
    data[size - 1] = null; // This element is now null
    // Decrement size
    size--;
    return e;
  }

  public String toString() {
    String result=" ";
    for (int i = 0; i < size; i++) {
      result+= data[i];
      if (i < size - 1) result+=", ";
    }
    return result.toString() + "]";
  }

  
  public int size() {
    return size;
  }
  
 public boolean sortList() {
    E hold;
	for (int i = 0; i < size-1; i++)
	 {
	   for (int j = 0; j<size-1; j++)
	    {  	 
	     if(((Comparable)data[j]).compareTo(data[j+1])>0)
	      {
	       hold= data[j+1];
	       data[j+1]=data[j];
	       data[j]=hold;
	      }       
	   }
     } 
	 return true;	  	
  }


 
}