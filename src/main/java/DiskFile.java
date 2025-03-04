/*
 * Copyright 2015 Jacques Berger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class  DiskFile {

    public static String loadFileIntoString( String cheminFichier ) throws IOException {

        return IOUtils.toString( new FileInputStream( cheminFichier ), StandardCharsets.UTF_8 );
    }

    public static void saveStringIntoFile( String cheminFichier, String contenu ) throws IOException {

        File f = new File(cheminFichier );
        FileUtils.writeStringToFile(f, contenu, "UTF-8" );
    }

}