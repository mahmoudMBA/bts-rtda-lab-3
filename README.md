# Implementing basic algorithm on Scala. 

The objective of this lab is to solve computational problems, using basic Scala constructions as:
1. Scala programs using Object and Main method.
2. Case class definitions. Reading writing text files.
4. Scala basic data structures: Map, Par, Seq.
3. Test using features of ```scalatest``` package.

Also to get familiar with Intellij IDE.     
   

## Order 
You have been asked to help study the population of birds migrating across the word. Each type of bird you are interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to a text file of sightings. The structure of the file is: contain in each line a comma separate sighting par with ```birdTypeId``` and the ```countryName``` where it was sighted. 

```
file:sightings.txt:
--------------
12, Italy
3, Germany
1, Italy
56, England
1, Cuba
567, Germany
1, EEUU  
...
```

Add the following functionalities to the Object ```MigratoryBirds```.   

1. Read from ```sightings.txt``` file an produce a ```Seq``` of ```String```.
2. Take a sighting par ```String``` and produce an object of type ```case class Sighting```.   
3.  
4. Total amount of sightings. Te app should produce a view (as text file) with the following structure:
```
file:total_amount_view.txt
---------------------
Total sightings: 6
``` 
4. 


## Intellij

- To run test:
    - Right click on ```src->scala->session2->Lab2Test``` pick the option ```Run Lab2Test```
    - Green means test passed, red mean test failure. 
