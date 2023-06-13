package ru.babushkina.week3.adtask.util;

import ru.babushkina.week3.adtask.model.Bear;

public class EventSimulator {
    // 1. медведь поспал +10 энергии 15% 0-15
    // 2. медведь гуляет -5 энергии 5% 15-20
    // 3. медведь охотится -10 энергии 10% 20-30
    // 4. медведь пробежал -15 энергии 20% 30-50
    // 5. медведь стоит и смотрит - 1 энергия 3% 50-53
    // 6. медведь съел рыбу - 7 энергии; fangscoeff * 5 здоровья 10% 53-63
    // 7. медведь съел мёд - 6 энергии; fangscoeff * 4 здоровья 5% 63-68
    // 8. медведь съел ягоды - 5 энергии; fangscoeff * 3 здоровья 5% 68-73
    // 9. на медведя напал охотник - 25 здоровья; 17% 73-100
    // 10. энергия медведя = 0 => -5 здоровья

    public void launchSimulator(Bear bear) {

    }

    private void sleepEvent(Bear bear) {
        int energy = bear.getEnergy();
        energy = energy + 10;
        if(energy > 100) {
            energy = 100;
        }
        bear.setEnergy(energy);
        System.out.println("Медвед поспал и восстановил 10 энергии. Теперь его текущая энергия равна: " + bear.getEnergy());
    }

    //private void walkEvent(Bear bear) {
      //  int energy = bear.getEnergy();
        //energy = energy - 5;
        //if(energy < 0) {
          //  energy = 0;
       // }
       // bear.setEnergy(energy);
        //System.out.println("Медведь гуляет, смотрит по сторонам и тратит на это 5 энергии. Теперь его текущая энергия равна: " + bear.getEnergy());
    //}
}
