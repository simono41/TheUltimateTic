/* 
 * Copyright (C) 2018 simono41
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package theultimatetic;

import GUI.spielfeld;

/**
 *
 * @author simono41
 */
public class KI {

    int zufallszahln = 0;

    public void berechnungen(int start) {

        /*
        *In die mitte kommen wenn nicht eins daneben
         */
        System.out.println("KI ist am Zug!!!");

        if (start == 1) {
            System.out.println("Erster Zug wird vorbereitet!!!");
            int zufallszahl = (int) (Math.random() * 3);
            System.out.println("Startzug: " + zufallszahl);

            this.check(zufallszahl);

            switch (zufallszahl) {
                case 0:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(1, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(0))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            +##
            ###
            ###
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(1, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(2, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(3, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(5, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(7, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(8, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(2))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            ##+
            ###
            ###
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(1, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(0, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(3, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(5, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(7, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(8, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(6))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            ###
            ###
            +##
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(1, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(2, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(3, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(5, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(0, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(7, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(8, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(8))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            ###
            ###
            ##+
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(1, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(2, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(3, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(5, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(7, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(0, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(1))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            #+#
            ###
            ###
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(0, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(2, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(3, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(5, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(7, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(8, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(3))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            ###
            +##
            ###
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(0, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(1, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(2, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(5, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(7, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(8, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(4))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            ###
            #+#
            ###
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(1, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(2, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(3, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(0, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(5, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(7, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(8, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(5))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            ###
            ##+
            ###
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(1, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(2, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(3, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(0, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(7, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(8, "o");
                    break;
                default:
                    break;
            }
        } else if ("x".equals(spielfeld.liste0.get(7))) {
            int zufallszahl = (int) (Math.random() * 8);
            System.out.println("Startzug: " + zufallszahl);

            /*
            ###
            ###
            #+#
             */
            zufallszahln=zufallszahl;
            this.check(zufallszahl);

            switch (zufallszahln) {
                case 0:
                    spielfeld.liste0.add(1, "o");
                    break;
                case 1:
                    spielfeld.liste0.add(2, "o");
                    break;
                case 2:
                    spielfeld.liste0.add(3, "o");
                    break;
                case 3:
                    spielfeld.liste0.add(4, "o");
                    break;
                case 4:
                    spielfeld.liste0.add(5, "o");
                    break;
                case 5:
                    spielfeld.liste0.add(6, "o");
                    break;
                case 6:
                    spielfeld.liste0.add(0, "o");
                    break;
                case 7:
                    spielfeld.liste0.add(8, "o");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("1. Bedingung nicht erfüllt!!!");
        }
    }

    public void check(int zufallszahl) {
        while (String.valueOf(zufallszahl).equals(spielfeld.liste0.get(zufallszahl))) {
            if (zufallszahl == 8) {
                if (String.valueOf(zufallszahl - 1).equals(spielfeld.liste0.get(zufallszahl - 1))) {
                    zufallszahln = zufallszahl - 1;
                } else if (String.valueOf(zufallszahl - 3).equals(spielfeld.liste0.get(zufallszahl - 3))) {
                    zufallszahln = zufallszahl - 3;
                } else if (String.valueOf(zufallszahl - 6).equals(spielfeld.liste0.get(zufallszahl - 6))) {
                    zufallszahln = zufallszahl - 6;
                }
            }

            if (zufallszahl == 7) {
                if (String.valueOf(zufallszahl - 1).equals(spielfeld.liste0.get(zufallszahl - 1))) {
                    zufallszahln = zufallszahl - 1;
                } else if (String.valueOf(zufallszahl + 1).equals(spielfeld.liste0.get(zufallszahl + 1))) {
                    zufallszahln = zufallszahl + 1;
                } else if (String.valueOf(zufallszahl - 3).equals(spielfeld.liste0.get(zufallszahl - 3))) {
                    zufallszahln = zufallszahl - 3;
                } else if (String.valueOf(zufallszahl - 6).equals(spielfeld.liste0.get(zufallszahl - 6))) {
                    zufallszahln = zufallszahl - 6;
                }
            }

            if (zufallszahl == 6) {
                if (String.valueOf(zufallszahl - 1).equals(spielfeld.liste0.get(zufallszahl - 1))) {
                    zufallszahln = zufallszahl - 1;
                } else if (String.valueOf(zufallszahl + 1).equals(spielfeld.liste0.get(zufallszahl + 1))) {
                    zufallszahln = zufallszahl + 1;
                } else if (String.valueOf(zufallszahl - 3).equals(spielfeld.liste0.get(zufallszahl - 3))) {
                    zufallszahln = zufallszahl - 3;
                } else if (String.valueOf(zufallszahl - 6).equals(spielfeld.liste0.get(zufallszahl - 6))) {
                    zufallszahln = zufallszahl - 6;
                }
            }

            if (zufallszahl == 5) {
                if (String.valueOf(zufallszahl - 1).equals(spielfeld.liste0.get(zufallszahl - 1))) {
                    zufallszahln = zufallszahl - 1;
                } else if (String.valueOf(zufallszahl - 1).equals(spielfeld.liste0.get(zufallszahl - 1))) {
                    zufallszahln = zufallszahl - 1;
                } else if (String.valueOf(zufallszahl + 3).equals(spielfeld.liste0.get(zufallszahl + 3))) {
                    zufallszahln = zufallszahl + 1;
                } else if (String.valueOf(zufallszahl - 3).equals(spielfeld.liste0.get(zufallszahl - 3))) {
                    zufallszahln = zufallszahl - 3;
                }
            }

            if (zufallszahl == 4) {
                if (String.valueOf(zufallszahl - 1).equals(spielfeld.liste0.get(zufallszahl - 1))) {
                    zufallszahln = zufallszahl - 1;
                } else if (String.valueOf(zufallszahl + 1).equals(spielfeld.liste0.get(zufallszahl + 1))) {
                    zufallszahln = zufallszahl + 1;
                } else if (String.valueOf(zufallszahl - 3).equals(spielfeld.liste0.get(zufallszahl - 3))) {
                    zufallszahln = zufallszahl - 3;
                } else if (String.valueOf(zufallszahl + 3).equals(spielfeld.liste0.get(zufallszahl + 3))) {
                    zufallszahln = zufallszahl + 3;
                } else if (String.valueOf(zufallszahl - 4).equals(spielfeld.liste0.get(zufallszahl - 4))) {
                    zufallszahln = zufallszahl - 4;
                } else if (String.valueOf(zufallszahl - 2).equals(spielfeld.liste0.get(zufallszahl - 2))) {
                    zufallszahln = zufallszahl - 2;
                } else if (String.valueOf(zufallszahl + 2).equals(spielfeld.liste0.get(zufallszahl + 2))) {
                    zufallszahln = zufallszahl + 4;
                } else if (String.valueOf(zufallszahl + 4).equals(spielfeld.liste0.get(zufallszahl + 4))) {
                    zufallszahln = zufallszahl + 4;
                }
            }

            if (zufallszahl == 3) {
                if (String.valueOf(zufallszahl + 1).equals(spielfeld.liste0.get(zufallszahl + 1))) {
                    zufallszahln = zufallszahl + 1;
                } else if (String.valueOf(zufallszahl + 2).equals(spielfeld.liste0.get(zufallszahl + 2))) {
                    zufallszahln = zufallszahl + 2;
                } else if (String.valueOf(zufallszahl - 3).equals(spielfeld.liste0.get(zufallszahl - 3))) {
                    zufallszahln = zufallszahl - 3;
                } else if (String.valueOf(zufallszahl + 3).equals(spielfeld.liste0.get(zufallszahl + 3))) {
                    zufallszahln = zufallszahl + 3;
                }
            }

            if (zufallszahl == 2) {
                if (String.valueOf(zufallszahl - 1).equals(spielfeld.liste0.get(zufallszahl - 1))) {
                    zufallszahln = zufallszahl - 1;
                } else if (String.valueOf(zufallszahl - 2).equals(spielfeld.liste0.get(zufallszahl - 2))) {
                    zufallszahln = zufallszahl - 2;
                } else if (String.valueOf(zufallszahl + 3).equals(spielfeld.liste0.get(zufallszahl - 3))) {
                    zufallszahln = zufallszahl - 3;
                } else if (String.valueOf(zufallszahl + 6).equals(spielfeld.liste0.get(zufallszahl - 6))) {
                    zufallszahln = zufallszahl - 6;
                }
            }

            if (zufallszahl == 1) {
                if (String.valueOf(zufallszahl - 1).equals(spielfeld.liste0.get(zufallszahl - 1))) {
                    zufallszahln = zufallszahl - 1;
                } else if (String.valueOf(zufallszahl + 1).equals(spielfeld.liste0.get(zufallszahl + 1))) {
                    zufallszahln = zufallszahl + 1;
                } else if (String.valueOf(zufallszahl + 3).equals(spielfeld.liste0.get(zufallszahl + 3))) {
                    zufallszahln = zufallszahl - 3;
                } else if (String.valueOf(zufallszahl + 6).equals(spielfeld.liste0.get(zufallszahl + 6))) {
                    zufallszahln = zufallszahl + 6;
                }
            }

            if (zufallszahl == 0) {
                if (String.valueOf(zufallszahl + 1).equals(spielfeld.liste0.get(zufallszahl + 1))) {
                    zufallszahln = zufallszahl + 1;
                } else if (String.valueOf(zufallszahl + 2).equals(spielfeld.liste0.get(zufallszahl + 2))) {
                    zufallszahln = zufallszahl - 2;
                } else if (String.valueOf(zufallszahl + 3).equals(spielfeld.liste0.get(zufallszahl + 3))) {
                    zufallszahln = zufallszahl - 3;
                } else if (String.valueOf(zufallszahl + 6).equals(spielfeld.liste0.get(zufallszahl + 6))) {
                    zufallszahln = zufallszahl + 6;
                }
            }

        }
    }
}
