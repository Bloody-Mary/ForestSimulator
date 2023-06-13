package ru.babushkina.week3.adtask.util;

import ru.babushkina.week3.adtask.model.Bear;

public class EventSimulator {
    // 1. медведь поспал +10 энергии 15% 0-15
    // 2. медведь гуляет -5 энергии 5% 15-20
    // 3. медведь охотится -10 энергии 10% 20-30
    // 4. медведь пробежал -15 энергии 20% 30-50
    // 5. медведь стоит и смотрит - 1 энергия 3% 50-53
    // 6. медведь съел рыбу - 7 энергии; fangscoeff * 5 здоровья 10% 53-63
    // 7. медведь съел мёд - 5 энергии; fangscoeff * 4 здоровья 5% 63-68
    // 8. медведь съел малину - 3 энергии; fangscoeff * 3 здоровья 5% 68-73
    // 9. на медведя напал охотник - 25 здоровья; 17% 73-100
    // 10. энергия медведя = 0 => -5 здоровья

    public void launchSimulator(Bear bear) {
        while (checkStatus(bear)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 15) {
                sleepEvent(bear);
            } else if (eventNumber >= 15 && eventNumber < 20) {
                walkEvent(bear);
            } else if (eventNumber >= 20 && eventNumber < 30) {
                huntEvent(bear);
            } else if (eventNumber >= 30 && eventNumber < 50) {
                standAndWatchEvent(bear);
            } else if (eventNumber >= 50 && eventNumber < 53) {
                runEvent(bear);
            } else if (eventNumber >= 53 && eventNumber < 63) {
                eatFishEvent(bear);
            } else if (eventNumber >= 63 && eventNumber < 68) {
                eatHoneyEvent(bear);
            } else if (eventNumber >= 68 && eventNumber < 73) {
                eatRaspberryEvent(bear);
            } else if (eventNumber >= 73 && eventNumber < 100) {
                hunterAttacks(bear);
            }
        }
        System.out.println("О, нет! Наш мишка умер! :( Game over.");
    }

    private void sleepEvent(Bear bear) {
        int energy = bear.getEnergy();
        energy += 10;
        if (energy > 100) {
            energy = 100;
        }
        bear.setEnergy(energy);
        checkEnergy(bear);
        System.out.println("Медвед поспал и восстановил 10 энергии. Теперь его текущая энергия равна: " + bear.getEnergy());
    }

    private void walkEvent(Bear bear) {
        int energy = bear.getEnergy();
        energy -= 5;
        if (energy < 0) {
            energy = 0;
        }
        bear.setEnergy(energy);
        checkEnergy(bear);
        System.out.println("Медведь гуляет, смотрит по сторонам и тратит на это 5 энергии. Теперь его текущая энергия равна: " + bear.getEnergy());
    }
    private void huntEvent(Bear bear) {
        int energy = bear.getEnergy();
        energy -= 10;
        if (energy < 0) {
            energy = 0;
        }
        bear.setEnergy(energy);
        checkEnergy(bear);
        System.out.println("Медведь охотиться и тратит 10 энергии. Теперь его текущая энергия равна: " + bear.getEnergy());
    }
    private void runEvent(Bear bear) {
        int energy = bear.getEnergy();
        energy -= 15;
        if (energy < 0) {
            energy = 0;
        }
        bear.setEnergy(energy);
        checkEnergy(bear);
        System.out.println("Медведь бежит и тратит 15 энергии. Теперь его текущая энергия равна: " + bear.getEnergy());
    }
    private void standAndWatchEvent(Bear bear) {
        int energy = bear.getEnergy();
        energy -= 1;
        if (energy < 0) {
            energy = 0;
        }
        bear.setEnergy(energy);
        checkEnergy(bear);
        System.out.println("Медведь стоит, смотрит по сторонам и тратит на это всего лишь 1 энергию. Теперь его текущая энергия равна: " + bear.getEnergy());
    }
    private void eatFishEvent(Bear bear) {
        int energy = bear.getEnergy();
        int health = bear.getHealth();

        energy -= 7;
        if (energy < 0) {
            energy = 0;
        }
        health += (int) (bear.getFANGCOEFF() * 5);
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        checkEnergy(bear);
        System.out.println("Медведь съел вкусную рыбу, потратил на это 7 энергии и восстановил здоровье. Теперь его текущая энергия равна: " + bear.getEnergy() + ", текущее здоровье: " + bear.getHealth());
    }

    private void eatHoneyEvent(Bear bear) {
        int energy = bear.getEnergy();
        int health = bear.getHealth();

        energy -= 5;
        if (energy < 0) {
            energy = 0;
        }
        health += (int) (bear.getFANGCOEFF() * 4);
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        checkEnergy(bear);
        System.out.println("Медведь съел своё любимое лакомство - мёд, потратил на это 5 энергии и восстановил здоровье. Теперь его текущая энергия равна: " + bear.getEnergy() + ", текущее здоровье: " + bear.getHealth());
    }
    private void eatRaspberryEvent(Bear bear) {
        int energy = bear.getEnergy();
        int health = bear.getHealth();

        energy -= 3;
        if (energy < 0) {
            energy = 0;
        }
        health += (int) (bear.getFANGCOEFF() * 3);
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        checkEnergy(bear);
        System.out.println("Медведь съел любимую малину, потратил на это 3 энергии и восстановил здоровье. Теперь его энергия равна: " + bear.getEnergy() + ", текущее здоровье: " + bear.getHealth());
    }
    private void hunterAttacks(Bear bear) {
        int health = bear.getHealth();
        health -= 25;
        if (health < 0) {
            health = 0;
        }
        bear.setHealth(health);
        checkEnergy(bear);
        System.out.println("Ого! На медведя напал охотник! Теперь его здоровье равно: " + bear.getHealth());
    }
    private void runOutOfEnergyEvent(Bear bear) {
        int energy = bear.getEnergy();
        int health = bear.getHealth();
        if (energy == 0) {
            health -= 5;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        System.out.println("Энергия медведя равна нулю!!! Он теряет " + bear.getHealth() + "здоровья!");
    }
    private boolean checkStatus(Bear bear) {
        System.out.println("Очки здоровья: " + bear.getHealth() + " количество энергии: " + bear.getEnergy());
        if (bear.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(Bear bear) {
        if (bear.getEnergy() <= 0) {
            int health = bear.getHealth();
            health -= 5;
            if (health < 0) {
                health = 0;
            }
            bear.setHealth(health);
        }
    }
}
