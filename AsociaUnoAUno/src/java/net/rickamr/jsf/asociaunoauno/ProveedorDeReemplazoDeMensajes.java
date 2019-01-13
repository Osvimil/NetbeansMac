/* Copyright 2014 Ricardo Armando Machorro Reyes
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package net.rickamr.jsf.asociaunoauno;

import java.util.HashMap;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import net.rickamr.biblioteca.jee.ReemplazoDeMensajes;



/** Proporciona el map para el reemplazo de mensajes.
 * @author Ricardo Armando Machorro Reyes */
@ApplicationScoped
public class ProveedorDeReemplazoDeMensajes {
  private static final HashMap<String, String> reemplazoDeMensajes = new HashMap<>();
  static {
    reemplazoDeMensajes.put(Empleado.RFC_DUPLICADO, "RFC duplicado.");
    reemplazoDeMensajes.
        put(Empleado.COMPUTADORA_ASIGNADA, "La computadora ya está asignada.");
    reemplazoDeMensajes.
        put(Computadora.INVENTARIO_DUPLICADO, "Inventario duplicado.");
    
  }
  @Produces @ReemplazoDeMensajes
  public HashMap<String, String> getReemplazoDeMensajes() {
    return reemplazoDeMensajes;
  }
}
