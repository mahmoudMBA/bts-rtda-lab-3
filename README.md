# Implementing basic algorithm on Scala. 

The objective of this lab is to solve computational problems, using basic Scala constructions as:
1. Scala programs using Object and Main method.
2. Case class definitions. Reading/writing text files.
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

The app should satisfy the following user stories .   

1. As a biologic scientists i need to know the Total amount of sightings. 
    - Te app should produce a view (as text file) with the following structure:
    
    ```
    file:total_amount_view.txt
    ---------------------
    Total sightings: 6
    ``` 

2. As a biologic scientists i need to know the Uniques Bird Type Detected. 
    - Te app should produce a view (as text file) with the following structure:

    ```text
    file:uniques_birdType_detected_view.txt
    ---------------------
    Uniques Bird Type Detected: 6
    ``` 

3. As a biologic scientists i need to know the Uniques Bird Type Detected. 
       - Te app should produce a view (as text file) with the following structure:
   
   ```text
   file:most_common_bird_view.txt
   ---------------------
   Most Common Bird: (1, 3)
   ``` 

4. As a biologic scientists i need to know the total amount of countries where at least one bird was sighted. 
       - Te app should produce a view (as text file) with the following structure:
   
   ```text
   file:country_sighted_count_view.txt
   ---------------------
   Country Sighted Count: 6
 
   ``` 
   
5. As a biologic scientists i need to know the two countries with more sighting. 
       - Te app should produce a view (as text file) with the following structure:
   
   ```text
   file:two_most_sighting_countries_view.txt
   ---------------------
   Two Most Sighting Countries: 
 
   ``` 
   


## Intellij

- To run test:
    - Right click on ```src->scala->session3``` pick the option ```Run ScalaTests on...```
    - Green means test passed, red mean test failure. 
