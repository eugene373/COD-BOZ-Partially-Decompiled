package com.facebook.model

// Auto-emitted from smali source: OpenGraphObject.java.
// 0 fields, 37 methods.

interface OpenGraphObject: com.facebook.model.GraphObject {
    public fun getApplication(): com.facebook.model.GraphObject

    public fun getAudio(): com.facebook.model.GraphObjectList

    public fun getCreateObject(): Boolean

    public fun getCreatedTime(): java.util.Date

    public fun getData(): com.facebook.model.GraphObject

    public fun getDescription(): String

    public fun getDeterminer(): String

    public fun getId(): String

    public fun getImage(): com.facebook.model.GraphObjectList

    public fun getIsScraped(): Boolean

    public fun getPostActionId(): String

    public fun getSeeAlso(): java.util.List

    public fun getSiteName(): String

    public fun getTitle(): String

    public fun getType(): String

    public fun getUpdatedTime(): java.util.Date

    public fun getUrl(): String

    public fun getVideo(): com.facebook.model.GraphObjectList

    public fun setApplication(p0: com.facebook.model.GraphObject)

    public fun setAudio(p0: com.facebook.model.GraphObjectList)

    public fun setCreateObject(p0: Boolean)

    public fun setCreatedTime(p0: java.util.Date)

    public fun setData(p0: com.facebook.model.GraphObject)

    public fun setDescription(p0: String)

    public fun setDeterminer(p0: String)

    public fun setId(p0: String)

    public fun setImage(p0: com.facebook.model.GraphObjectList)

    public fun setImageUrls(p0: java.util.List)

    public fun setIsScraped(p0: Boolean)

    public fun setPostActionId(p0: String)

    public fun setSeeAlso(p0: java.util.List)

    public fun setSiteName(p0: String)

    public fun setTitle(p0: String)

    public fun setType(p0: String)

    public fun setUpdatedTime(p0: java.util.Date)

    public fun setUrl(p0: String)

    public fun setVideo(p0: com.facebook.model.GraphObjectList)

}
