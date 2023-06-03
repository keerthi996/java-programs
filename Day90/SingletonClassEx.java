/*
    Singleton Pattern says that just"define a class that has only one instance and provides a
    global point of access to it".
*/

/*
    *** Saves memory because object is not created at each request. Only single instance is 
    reused again and again.

    ***Singleton pattern is mostly used in multi-threaded and database applications. It is 
    used in logging, caching, thread pools, configuration settings etc.

 */

 /*
  ***To create the singleton class, we need to have static member of class, private constructor and static factory method.

        # Static member: It gets memory only once because of static, itcontains the instance of the
            Singleton class.
        # Private constructor: It will prevent to instantiate the Singleton class from outside 
            the class.
        # Static factory method: This provides the global point of access to the Singleton
            object and returns the instance to the caller.

  */
  class SingletonClassEx{
    public static void main(String[] args){
        Single sobj=Single.returnSingle();
        System.out.println(sobj);
    }
  }
  class Single{
    public static Single s=new Single();
    private Single(){                        

    }
    public static Single returnSingle(){
        return s;
    }
  }