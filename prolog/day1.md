* Make a simple knowledge base. Represent some of your favorite books and authors.

#### authors.pl
    book(bryan_caplan, myth_of_the_rational_voter).
    book(timothy_snyder, bloodlands).
    book(william_poundstone, priceless).
    book(hazlitt, economics_in_one_lesson).
    book(murray_rothbard, enemy_of_the_state).
    book(murray_rothbard, for_a_new_liberty).
    book(william_bernstein, a_splendid_exchange).

* Find all books in your knowledge base written by one author.

#### Execute:

    | ?- ['authors.pl'].
    compiling /home/brian/authors.pl for byte code...
    /home/brian/Projects/7in7/prolog/authors.pl compiled, 7 lines read - 1133 bytes written, 9 ms
    
    yes
    
    | ?- book(bryan_caplan, What).
    
    What = myth_of_the_rational_voter
    
    yes

* Make a knowledge base representing musicians and instruments. Also represent musicians and their genre of music.

#### music.pl
instrument(andrew_bird, whistle).
instrument(andrew_bird, violin).
instrument(daft_punk, turntable).
instrument(galactic, piano).
instrument(bajafondo, violin).
instrument(xavier_rudd, didgeridoo).
instrument(clutch, drums).
instrument(johnny_cash, guitar).

genre(andrew_bird, folk_rock).
genre(daft_punk, electronic).
genre(galactic, funk).
genre(bajafondo, latin_electronic).
genre(xavier_rudd, roots).
genre(clutch, stoner_rock).
genre(johnny_cash, county).

* Find all musicians who play the guitar.

#### Execute:
    | ?- ['music.pl'].           
    compiling /home/brian/music.pl for byte code...
    /home/brian/music.pl compiled, 16 lines read - 1870 bytes written, 12 ms
    yes
    | ?- instrument(What, guitar).
    What = johnny_cash
    yes
