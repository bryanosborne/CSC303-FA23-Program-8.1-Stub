package testmyarray;

public interface ListInterface<T> {
   public void add(T newEntry);

   public void add(int newPosition, T newEntry);
   
   public T remove(int givenPosition);
   
   public void clear();

   public T set(int givenPosition, T newEntry);
   
   public T get(int givenPosition);

   public T[] toArray();

   public boolean contains(T anEntry);

   public int size();

   public boolean isEmpty();
} 

