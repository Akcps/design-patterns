# Composite Design Pattern

Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.


### Example

WAP to create a program for electrical components with the following structure

                      Computer
                        /\
                       /  \
                 cabinet   peripheral devices
                  /\            
                 /  \          
        hard-drive  motherboard
                      /\
                     /  \
                  RAM   CPU
