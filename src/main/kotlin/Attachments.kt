interface Attachments {
    val type: String
}
data class AttachmentPhoto(
    override val type: String = "photo",
    val photo: Photo
) : Attachments

data class AttachmentVideo(
    override val type: String = "video",
    val video: Video
) : Attachments

data class AttachmentAudio(
    override val type: String = "audio",
    val audio: Audio
) : Attachments

data class AttachmentNote(
    override val type: String = "note",
    val note: Note
) : Attachments

data class AttachmentDoc(
    override val type: String = "doc",
    val doc: Doc
) : Attachments

data class Photo(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val albumId: Int,
    val userId: Int,
    val text: String,
    val width: Int,
    val height: Int
)

data class Video(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val width: Int,
    val height: Int,
    val canEdit: Boolean,
    val canRepost: Boolean
)

data class Audio(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val artist: String,
    val duration: Int,
    val albumId: Int,
    val noSearch: Boolean
)

data class Doc(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val type: Int
)

data class Note(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val title: String,
    val text: String,
    val comments: Int,
    val readComments: Int,
    val canComment: Boolean
)

