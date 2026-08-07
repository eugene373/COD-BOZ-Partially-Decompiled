package com.facebook.model

// Auto-emitted from smali source: OpenGraphAction.java.
// 0 fields, 37 methods.

interface OpenGraphAction: com.facebook.model.GraphObject {
    public fun getApplication(): com.facebook.model.GraphObject

    public fun getComments(): org.json.JSONObject

    public fun getCreatedTime(): java.util.Date

    public fun getData(): com.facebook.model.GraphObject

    public fun getEndTime(): java.util.Date

    public fun getExpiresTime(): java.util.Date

    public fun getExplicitlyShared(): Boolean

    public fun getFrom(): com.facebook.model.GraphUser

    public fun getId(): String

    public fun getImage(): java.util.List

    public fun getLikes(): org.json.JSONObject

    public fun getMessage(): String

    public fun getPlace(): com.facebook.model.GraphPlace

    public fun getPublishTime(): java.util.Date

    public fun getRef(): String

    public fun getStartTime(): java.util.Date

    public fun getTags(): com.facebook.model.GraphObjectList

    public fun getType(): String

    public fun setApplication(p0: com.facebook.model.GraphObject)

    public fun setComments(p0: org.json.JSONObject)

    public fun setCreatedTime(p0: java.util.Date)

    public fun setData(p0: com.facebook.model.GraphObject)

    public fun setEndTime(p0: java.util.Date)

    public fun setExpiresTime(p0: java.util.Date)

    public fun setExplicitlyShared(p0: Boolean)

    public fun setFrom(p0: com.facebook.model.GraphUser)

    public fun setId(p0: String)

    public fun setImage(p0: java.util.List)

    public fun setImageUrls(p0: java.util.List)

    public fun setLikes(p0: org.json.JSONObject)

    public fun setMessage(p0: String)

    public fun setPlace(p0: com.facebook.model.GraphPlace)

    public fun setPublishTime(p0: java.util.Date)

    public fun setRef(p0: String)

    public fun setStartTime(p0: java.util.Date)

    public fun setTags(p0: java.util.List)

    public fun setType(p0: String)

}
