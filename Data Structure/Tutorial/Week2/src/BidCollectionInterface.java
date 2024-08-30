
import wia1002.t3.BidInterface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author HP
 */
public interface BidCollectionInterface<E extends BidInterface>{
    /**
     * Adds a bid to this collection.
     * @param bid the bid to be added
     */
    void addBid(E bid);

    /**
     * Returns the bid in this collection with the best yearly cost.
     * @return the bid in this collection with the best yearly cost
     */
    E getBestYearlyCoseBid();

    /**
     * Returns the bid in this collection with the best initial cost.
     * The initial cost will be defined as the unit cost plus the installation cost.
     * @return the bid in this collection with the best initial cost
     */
    E getBestInitialCostBid();

    /**
     * Clears all of the items from this collection.
     */
    void clear();

    /**
     * Gets the number of items in this collection.
     * @return the number of items in this collection
     */
    int getNumberOfItems();

    /**
     * Sees whether this collection is empty.
     * @return true if this collection is empty, false otherwise
     */
    boolean isEmpty();
}
