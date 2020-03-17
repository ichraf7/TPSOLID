package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Ressource resource)
    {
        int resourceId;
        resourceId =resource.findRessource();
        resource.markResourceBusy(resourceId);
        return resourceId;
    }

    public void free(Ressource resource, int resourceId)
    {

        resource.markResourceFree(resourceId)

    }

}
