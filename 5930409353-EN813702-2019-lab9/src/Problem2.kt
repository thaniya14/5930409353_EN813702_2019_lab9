package boonbutra.thaniya.lab9

open class Book(val title: String, val author : String){
    protected var currentPage = 1
    open fun readPage(){
        currentPage++
    }

    override fun toString(): String {
        return "Title : $title Author: $author CurrentPage: $currentPage\n"
    }

}

fun main(args :Array<String>){
    var books =Book("Principles","Ray Dalio")
    books.readPage()
    println(books)
    var ebook1 = eBook("How will You Measure Your Life?","Clayton M. Christensen")
    println(ebook1)
    ebook1.readPage()
    var ebook2 = eBook("End of Days: Predictions and Prophecies about the End of the World","Sylvia Browne")
    ebook2.readPage()
    ebook2.readPage()
    println(ebook2)
}

class eBook(title: String,author: String,val format: String="text") : Book(title,author){
    override fun readPage(){
        super.readPage()
    }

    override fun toString(): String {
        return super.toString() + "Format $format WordCount: ${currentPage*250}"
    }
}