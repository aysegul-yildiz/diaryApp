public class page 
{
    // Ayşegül Yıldız
    
    private char[] contents;

    public page( int size ) 
    {
        // fill pages with "-" characters
        contents = new char[ size ];
        for ( int i = 0; i < size; i++ )
        {
            contents [i] = '-';
        }
    }

    public void writePage( String note )
    {
        // fill contents array with the characters from given input
        for ( int i = 0; i < contents.length && i < note.length() ; i++ )
        {
            contents[i] = note.charAt(i);
        }
    }

    public String toString()
    {
        // transform the characters from contents array to string
        String note = " ";
       for ( int i = 0; i < contents.length; i++ )
       {
           note += contents[i];
       }
       return note;
    }
     
    
    
}
