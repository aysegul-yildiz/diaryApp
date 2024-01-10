public class Notebook 
{
    // Ayşegül Yıldız

    private int index;
    private int pageNum;
    private int pageSize;
    private page[] pages;

    public Notebook( int pageNum, int pageSize )
    {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        // create object array
        this.pages = new page[pageNum]; 
        // create given amount of pages and pass the given page size to them to create page objects
        for ( int i = 0; i <  pageNum; i++ )
        {
            pages[i] = new page( pageSize );
        } 
    }

    public void writeNote( String note)
    {
        // if there is no page created then set index to zero
        if ( pages[0] == null )
        {
            index = 0;
        }
        // if there is a note entered then pass it to page class and fill it with the note 
        pages[index] = new page(pageSize);
        pages[index].writePage(note);
        // increment the current page index
        index++;
    }

    public void printNotebook()
    {
        /*for ( int i = (pageNum - 1); i < (pageNum - index); i--)
        {
            pages[i] = new page(pageSize);
        }*/
        // print the pages
        for ( int i = 0; i < pageNum; i++ )
        {
            System.out.println( i+1  + pages[i].toString() );
        }
    }
}
