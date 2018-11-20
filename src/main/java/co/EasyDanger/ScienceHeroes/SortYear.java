package co.EasyDanger.ScienceHeroes;

import java.util.Comparator;

import co.EasyDanger.ScienceHeroes.model.Hero;

class SortYear implements Comparator<Hero> 
{ 
    // Used for sorting in ascending order of year
    public int compare(Hero a, Hero b) 
    { 
        return a.getYear() - b.getYear(); 
    } 
    
    
} 