# Assignment3 - WordFrequencies.java

This is a  WordFrequencies java program an class assignment for my CISC 3130 - Data Structure class. 

PROBLEM THAT I HAD TO SOLVE: 
I had to write a programm which can take a .txt file of lyrics of a song or a poem or a paragraph from a book. and using my code i need to take that .txt file as an input. using a data structure i have to write a code which can count the appearance of each unique word in the lyrics/poem/paragraph and print the number of appearences of each unique words in a word frequency list. 

SOLUTION:
Before writing the code first i get the song lyrics of "Starman" by "David Bowie" from the internet and saved that as a .txt file which i will use to analyze in my progre later. for the code section first i import necessary packages for our programm. then use the scanner class to read the lyrics.txt file as an input. it use an if-else statement to count the freqencies of words also it use a for loop to make sure code removes charechtars from a string that are not letters. and the using a data structure it print each unique words from the lyrics.txt file in an alphabetical order along with number of there appearance.

WHAT I USED:
for my codde i used TreeMap data structue. TreeMap is a Red-Black tree based NavigableMap implementation. Unlike LinkedHashMap and HashMap this data structure does not use hashing for storing keys. i chosed this perticular data structure mainly because it is simple and it also print output in alphabetical order which looks nice then random word list. HashMap has no ordering when you iterate through it; TreeMap iterates in the natural key order. also in my code i used a for loop and if-else statement. 

EXAMPLE OF MY INPUT/OUTPUT FILE (THEY ARE ALSO IN MY Assignment3 RESPOSITORY ALONG WITHTHE PROGRAMM WordFrequencies.java)

lyrics.txt:

Starman 
by David Bowie

[Intro]
Hey now, now
Oh, oh, oh

[Verse 1]
Didn't know what time it was, the lights were low
I leaned back on my radio
Some cat was layin down some rock 'n' roll
"Lotta soul," he said
Then the loud sound did seem to fade
Came back like a slow voice on a wave of phase
That weren't no DJ, that was hazy cosmic jive

[Chorus]
There's a starman waiting in the sky
He'd like to come and meet us
But he thinks he'd blow our minds
There's a starman waiting in the sky
He's told us not to blow it
'Cause he knows it's all worthwhile
He told me
Let the children lose it
Let the children use it
Let all the children boogie

[Verse 2]
I had to phone someone so I picked on you
Hey, that's far out, so you heard him too
Switch on the TV, we may pick him up on channel two
Look out your window, I can see his light
If we can sparkle he may land tonight
Don't tell your poppa or he'll get us locked up in fright

[Chorus]
There's a starman waiting in the sky
He'd like to come and meet us
But he thinks he'd blow our minds
There's a starman waiting in the sky
He's told us not to blow it
'Cause he knows it's all worthwhile
He told me
Let the children lose it
Let the children use it
Let all the children boogie

[Chorus]
Starman waiting in the sky
He'd like to come and meet us
But he thinks he'd blow our minds
There's a starman waiting in the sky
He's told us not to blow it
'Cause he knows it's all worthwhile
He told me
Let the children lose it
Let the children use it
Let all the children boogie

[Outro]
La, la, la, la-la, la, la, la
La, la, la, la-la, la, la, la
La, la, la, la-la, la, la, la
La, la, la, la-la, la, la, la
La, la, la, la-la, la, la, la
La, la, la, la-la, la, la, la
La, la, la, la-la, la, la, la
La, la, la, la-la, la, la, la

output.txt:

 ----jGRASP exec: java WordFrequencies
                                        2
 a                                      7
 all                                    6
 and                                    3
 back                                   2
 blow                                   6
 boogie                                 3
 bowie                                  1
 but                                    3
 by                                     1
 came                                   1
 can                                    2
 cat                                    1
 cause                                  3
 channel                                1
 children                               9
 chorus                                 3
 come                                   3
 cosmic                                 1
 david                                  1
 did                                    1
 didnt                                  1
 dj                                     1
 dont                                   1
 down                                   1
 fade                                   1
 far                                    1
 fright                                 1
 get                                    1
 had                                    1
 hazy                                   1
 he                                    11
 heard                                  1
 hed                                    6
 hell                                   1
 hes                                    3
 hey                                    2
 him                                    2
 his                                    1
 i                                      4
 if                                     1
 in                                     7
 intro                                  1
 it                                    10
 its                                    3
 jive                                   1
 know                                   1
 knows                                  3
 la                                    48
 lala                                   8
 land                                   1
 layin                                  1
 leaned                                 1
 let                                    9
 light                                  1
 lights                                 1
 like                                   4
 locked                                 1
 look                                   1
 lose                                   3
 lotta                                  1
 loud                                   1
 low                                    1
 may                                    2
 me                                     3
 meet                                   3
 minds                                  3
 my                                     1
 n                                      1
 no                                     1
 not                                    3
 now                                    2
 of                                     1
 oh                                     3
 on                                     5
 or                                     1
 our                                    3
 out                                    2
 outro                                  1
 phase                                  1
 phone                                  1
 pick                                   1
 picked                                 1
 poppa                                  1
 radio                                  1
 rock                                   1
 roll                                   1
 said                                   1
 see                                    1
 seem                                   1
 sky                                    6
 slow                                   1
 so                                     2
 some                                   2
 someone                                1
 soul                                   1
 sound                                  1
 sparkle                                1
 starman                                7
 switch                                 1
 tell                                   1
 that                                   2
 thats                                  1
 the                                   18
 then                                   1
 theres                                 5
 thinks                                 3
 time                                   1
 to                                     8
 told                                   6
 tonight                                1
 too                                    1
 tv                                     1
 two                                    1
 up                                     2
 us                                     7
 use                                    3
 verse                                  2
 voice                                  1
 waiting                                6
 was                                    3
 wave                                   1
 we                                     2
 were                                   1
 werent                                 1
 what                                   1
 window                                 1
 worthwhile                             3
 you                                    2
 your                                   2
 
  ----jGRASP: operation complete.
