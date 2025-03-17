const app = window.app || {
    Elmt: {},
    Act: {},
}


$(()=>{
    console.log(123);
    fn_bindEvent();
    app.Elmt.init();
    app.Act.init();
})


app.Act = (() => {
    var self;

    return {
        init: function() {
            self = this;
            self.getBoard();
        },
        getBoard: function() {
            $.ajax(
                {
                    url: '/boards',
                    type: 'post',
                    success: function (data) {
                        console.log(data);
                    },
                },
            )
        }
    }
})();

app.Elmt = (() => {
    return {
        init: ()=> {

        }
    }
})();


const fn_bindEvent = () => {

}