/**
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */


package org.jboss.messaging.core.local;

import org.jboss.messaging.core.PersistenceManager;
import org.jboss.messaging.core.MessageStore;
import org.jboss.messaging.core.ChannelSupport;



/**
 * @author <a href="mailto:ovidiu@jboss.org">Ovidiu Feodorov</a>
 * @version <tt>$Revision$</tt>
 * $Id$
 */
public class Pipe extends ChannelSupport
{
   // Constants -----------------------------------------------------

   // Static --------------------------------------------------------
   
   // Attributes ----------------------------------------------------
   
   // Constructors --------------------------------------------------

   public Pipe(String name, MessageStore ms)
   {
      this(name, ms, null);
   }

   public Pipe(String name, MessageStore ms, PersistenceManager pm)
   {
      super(name, ms, pm, false);
      router = new SingleDestinationRouter();
   }

   // Channel implementation ----------------------------------------

   // Public --------------------------------------------------------

   public String toString()
   {
      return "CorePipe[" + getChannelID() + "]";
   }

   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------   
}
