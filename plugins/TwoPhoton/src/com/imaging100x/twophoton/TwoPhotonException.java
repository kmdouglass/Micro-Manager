/*
 * AUTHOR:
 * Nenad Amodaj
 *
 * Copyright (c) 2011 Nenad Amodaj
 * Copyright (c) 2009 100X Imaging Inc
 *
 * This is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.imaging100x.twophoton;

public class TwoPhotonException extends Exception {
   private static final long serialVersionUID = 1L;
   private Throwable cause;

   /**
    * Constructs an exception object with an explanatory message.
    * @param message - the reason for the exception.
    */
   public TwoPhotonException(String message) {
      super("TwoPhoton error: " + message);
   }

   public TwoPhotonException(Throwable t) {
      super(t.getMessage());
      this.cause = t;
   }

   public Throwable getCause() {
      return this.cause;
   }

}