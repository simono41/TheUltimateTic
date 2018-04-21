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
package readandwrite;

import GUI.spielfeld;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author simono41
 */
public class read {

    public void read() throws FileNotFoundException, IOException {
        String zeile;
        FileReader fr = new FileReader("./save.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            while ((zeile = br.readLine()) != null) {
                spielfeld.liste0.add(zeile);
            }
            br.close();
        }
    }
}
