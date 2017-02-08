/**
 * Created by Павел on 06-Feb-17.
 */
$( document ).ready(function() {
    $("#idForm").submit(function (event) {
        event.preventDefault();
        $.get("subscriptions/get",$("#idForm").serialize(),function () {
            window.location.replace("subscriptions/get?"+$("#idForm").serialize());
        })
    });
});
