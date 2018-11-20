package co.EasyDanger.ScienceHeroes;

import java.util.Comparator;

import co.EasyDanger.ScienceHeroes.model.Hero;

class SortReay implements Comparator<Hero> 
{ 
    // Used for sorting in ascending order of year
    public int compare(Hero a, Hero b) 
    { 
        return b.getYear() - a.getYear(); 
    } 
    
    
} 