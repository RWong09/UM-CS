package wia1002.t3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author HP
 */
public interface BidInterface {
    /**
     * Returns the name of the company making this bid.
     * @return the name of the company
     */
    String getCompanyName();

    /**
     * Returns the description of the air conditioner that this bid is for.
     * @return the description of the air conditioner
     */
    String getDescription();

    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * @return the capacity of the AC
     */
    double getCapacity();

    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * @return the seasonal efficiency of the AC
     */
    double getSeasonalEfficiency();

    /**
     * Returns the cost of this bid's AC.
     * @return the cost of the AC
     */
    double getCost();

    /**
     * Returns the cost of installing this bid's AC.
     * @return the cost of installing the AC
     */
    double getInstallationCost();

    /**
     * Returns the yearly cost of operating this bid's AC.
     * @return the yearly cost of operating the AC
     */
    double getYearlyOperationCost();    
}
