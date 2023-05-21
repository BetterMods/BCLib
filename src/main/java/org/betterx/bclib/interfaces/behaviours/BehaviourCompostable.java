package org.betterx.bclib.interfaces.behaviours;

/**
 * Interface for blocks that can be composted.
 * <p>
 * {@link org.betterx.bclib.api.v2.PostInitAPI} will add the
 * {@link org.betterx.worlds.together.tag.v3.CommonItemTags#COMPOSTABLE} tag to the items of all blocks that
 * implement this interface. It will also register the Block with the {@link org.betterx.bclib.api.v2.ComposterAPI}
 */
public interface BehaviourCompostable {

    /**
     * The chance that this block will be composted.
     * <p>
     * The default value is 0.1f.
     *
     * @return The chance that this block will be composted.
     */
    default float compostingChance() {
        return 0.1f;
    }
}