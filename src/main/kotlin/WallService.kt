object WallService {
    private var posts = emptyArray<Post>()

        var postId = 0

    fun add(post: Post): Post {
        postId += 1
        val post = post.copy(id = postId)
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.id
        for ((index, arrayPost) in posts.withIndex()) {
            if (arrayPost.id == postId) {
                posts[index] = post.copy(
                    ownerId = arrayPost.ownerId,
                    date = arrayPost.date
                )
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        postId = 1
    }


}