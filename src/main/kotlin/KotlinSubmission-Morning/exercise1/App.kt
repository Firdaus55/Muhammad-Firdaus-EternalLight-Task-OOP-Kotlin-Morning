package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName = "Muhammad"
    val lastName = "Firdaus"
    val age = 20
    val isSingle = true

    println("Haloo, nama saya adalah $firstName $lastName, dan saya berusia $age tahun, saya berstatus single $isSingle")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    return Any()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(memberMassive: List<Any>): Any {

    return memberMassive[2]
}
/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(members: List<String>): Int {
    val mentor = arrayOf<String>("Jovian", "Imam")

    return mentor.size + members.size
}

fun main() {
    val anggotaTeam = listOf<String>(
        "Austin Nicholas Tham",
        "Muhammad Firdaus",
        "Mutiara Sabrina",
        "Rahmad Noor Ikhsan",
        "Dito Iqbal",
        "Fadhila Risfaniatul Z",
        "Aina Fazla",
        "Rizka Hilmi P",
        "Alfin Satriawan",
        "Kayla Vyanca A",
        "Adityo Khori R"
    )

    myProfile()

    val myTeam = myTeam(anggotaTeam)
    println("My team is: $myTeam")

    val totalMember = totalMember(anggotaTeam)
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Eternal Light", anggotaTeam, "Morning")

}